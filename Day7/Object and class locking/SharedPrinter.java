//Write a Java program to demonstrate object-level and method-level locking using multithreading.
// The program should:
//Create a shared resource class (e.g., SharedPrinter) with two synchronized methods:
//Method 1: Print a given string multiple times.
//Method 2: Print a countdown from a given number.
//Use two threads:
//Thread 1: Calls the first synchronized method (print string).
//Thread 2: Calls the second synchronized method (countdown).
//Demonstrate the difference between:
//Object-Level Locking: When both threads use the same instance of the shared resource.
//Class-Level Locking: When both threads use a static synchronized method or block.
//Show how the locks affect the execution order of the methods.

import java.lang.Runnable;
public class SharedPrinter {
    private final Object lock1=new Object();
    public synchronized void print(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void count(int c) {
        for (int i = 0; i < 10; i++) {
            System.out.println(c);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        SharedPrinter sharedPrinter = new SharedPrinter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                sharedPrinter.print("Hello");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                sharedPrinter.count(1);
            }
        });
        t1.start();
        t2.start();
    }
    }


