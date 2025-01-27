//Exercise:
//Simulate a simple multithreaded task executor:
//Create a fixed-thread pool of size 5 using Executors.newFixedThreadPool(5).
//Submit 10 tasks (e.g., printing numbers from 1 to 10) and observe how tasks are distributed among threads.
//Use VisualVM to monitor the thread usage and performance.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadTaskExecutor {
    public static void main(String[] args){
        ExecutorService executors=  Executors.newFixedThreadPool(5);
        for(int i=1;i<=10;i++) {
            int task=i;
            executors.submit(()  -> {
                System.out.println(task);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executors.shutdown();
    }
}
