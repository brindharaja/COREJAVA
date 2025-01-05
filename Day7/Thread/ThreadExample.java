//Write a Java program to demonstrate the use of multithreading. The program should:
//Create two threads:
//Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
//Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
//Ensure both threads run concurrently.
//Use Thread class or Runnable interface for thread implementation.

public class ThreadExample extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("num : "+i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.print("Exception occurs");
            }
        }
    }
}
class ThreadSquareExample extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Square num : "+i*i);
            try{
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.print("Exception occurs");
            }
        }
    }
    public static void main(String[] args){
        ThreadExample t1=new ThreadExample();
        ThreadSquareExample t2=new ThreadSquareExample();
        t1.start();
        t2.start();
    }
}
