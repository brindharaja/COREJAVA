//Create a program that allows the user to manage a task list using a LinkedListExample.
//Implement the following features:
//Add a task to the end of the list.
//Remove a task from the list by its name.
//Display all tasks in the list in the order they were added.
//
//Input Example:
//Add tasks: "Finish homework", "Go for a run", "Prepare dinner".
//Remove task: "Go for a run".
//Output Example:
//Task List:
//1. Finish homework
//2. Prepare dinner

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> task=new LinkedList<String>();
        System.out.println("Add task : ");
        task.add("Finish homework");
        task.add("Go for a run");
        task.add("Prepare dinner");
        System.out.println(task.toString());
        System.out.println("Remove task : ");
        String Remove=sc.nextLine();
        task.remove(Remove);
        int c=1;
        System.out.println("Task List:");
        for(String str:task){
            System.out.println(c+". "+str);
            c++;
        }

    }
}