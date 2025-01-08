//Create a program that uses a Queue to manage a Customer Support System. The program should:
//Add customers to the queue as they arrive.
//Serve customers in the order they arrived (FIFO - First In, First Out).
//Display the list of waiting customers.
//Input Example:
//Add customers: "Alice", "Bob", "Charlie".
//Serve customer: 1.
//Output Example:
//Serving: Alice
//Waiting: [Bob, Charlie]

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<String> q=new PriorityQueue<>();
        System.out.println("Add customers: ");
        q.add("Alice");
        q.add("Bob");
        q.add("Charlie");
        System.out.println(q.toString());
        System.out.println("Serve customer");
        int n=sc.nextInt();
        System.out.println("Serving : "+q.poll());
        System.out.println("Waiting : "+q.toString());
    }
}
