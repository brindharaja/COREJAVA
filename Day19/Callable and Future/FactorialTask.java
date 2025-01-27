//Exercise:
//Write a program to calculate the factorial of a number using Callable and Future.
//Create a FactorialTask class that implements Callable<Long>.
//Use an ExecutorService to submit the task.
//Retrieve the result using the Future.get() method.

import java.util.concurrent.*;

public class FactorialTask implements Callable<Long> {
    int num;
    FactorialTask(int num){
        this.num=num;
    }
    public Long call(){
        long res=1;
        for(int i=1;i<=num;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args){
        FactorialTask task=new FactorialTask(10);
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<Long> future=executorService.submit(task);
        try {
            Long factorial = future.get();
            System.out.println(factorial);
        }catch (Exception e){
            System.out.println("Exception occurs");
        }finally {
            executorService.shutdown();
        }
    }
}
