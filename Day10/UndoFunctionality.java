//Stack and Queue
//Problem Statement for Stack: Undo Functionality
//Create a program that uses a Stack to implement an Undo feature for a text editor.
// The program should:
//Allow the user to perform actions like typing words (e.g., "Hello", "World").
//Store each action in the stack.
//Undo the last action by popping it from the stack.
//Input Example:
//Actions: "Type Hello", "Type World", "Undo", "Type Java".
//Output Example:
//Current Text: Hello Java

import java.util.Scanner;
import java.util.Stack;

public class UndoFunctionality {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        char ch;
        do {
            System.out.println("1.Type\n2.Undo");
            int n=sc.nextInt();
            sc.nextLine();
            if(n==1){
                System.out.println("Type : ");
                String str=sc.nextLine();
                stack.push(str);
            }else if(n==2){
                System.out.println("Undo..");
                stack.pop();
            }System.out.println("Do you want to continue..(y/n) : ");
            ch=sc.nextLine().charAt(0);
        }while(ch=='y');
        System.out.println("Current Text : ");
        StringBuilder result = new StringBuilder();
        for(String word:stack) {
            result.append(word).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
