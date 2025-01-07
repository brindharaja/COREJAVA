//Contact Directory Management System
//Create a program to manage a contact directory using a Hashtable in Java.
//Implement the following functionalities:
//Add contacts with the name as the key and phone number as the value.
//Search for a contact by name and display their phone number.
//Remove a contact by name.
//Display all contacts in the directory.
//Input Example:
//Add contacts: John -> 9876543210, Alice -> 9123456780, Bob -> 8899776655.
//Search for Alice.
//Remove contact Bob.
//Output Example:
//Contact Directory:
//John: 9876543210
//Alice: 9123456780
//Search Result for Alice: 9123456780
//After Removal:
//John: 9876543210
//Alice: 9123456780

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class DirectoryManagement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put("John","9876543210");
        hashtable.put("Alice","9123456780");
        hashtable.put("Bob","8899776655");
        System.out.println(hashtable.toString());
        System.out.println("Search: ");
        String search=sc.nextLine();
        System.out.println(hashtable.get(search));
        System.out.println("Remove: ");
        String remove=sc.nextLine();
        hashtable.remove(remove);
        System.out.println("After Removal : "+hashtable.toString());

    }
}
