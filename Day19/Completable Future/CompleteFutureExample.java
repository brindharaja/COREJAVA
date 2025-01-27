//Exercise:
//Write a program using CompletableFuture to simulate the following tasks:
//Task 1: Fetch user data (simulate with a Thread.sleep()).
//Task 2: Fetch user orders (simulate with a Thread.sleep()).
//Combine the results of both tasks and print the user details along with the orders.
//Use thenCombine() to merge the results from both tasks.

import java.util.concurrent.CompletableFuture;

public class CompleteFutureExample {
    public static void main(String[] args){
        CompletableFuture<String> data=CompletableFuture.supplyAsync(()-> {
            try{
                Thread.sleep(100);
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
            return "Alice";
        });
        CompletableFuture<String> order=CompletableFuture.supplyAsync(()-> {
            try{
                Thread.sleep(100);
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
            return "Samsung S22";
        });
        CompletableFuture<String> res=data.thenCombine(order,(s1,s2)->s1+":"+s2);
        res.thenAccept(System.out::println);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
