//Create a program that uses a Map to store and
//manage student names and their corresponding grades.
//Implement the following features:
//Add a student's name and grade to the map.
//Update a student's grade if the student already exists in the map.
//Retrieve a student's grade by their name.
//Display all students and their grades.
//Input Example:
//Add: {"Alice": 85, "Bob": 90, "Charlie": 88}
//Update: {"Bob": 92}
//Retrieve: "Alice"
//Output Example:
//Alice's grade: 85
//All students and grades:
//Alice: 85
//Bob: 92
//Charlie: 88

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> student =new HashMap<String, Integer>();
        student.put("Alice",85);
        student.put("Bob",90);
        student.put("Charlie",88);
        System.out.println("Add: "+student.toString());
        System.out.println("Update: ");
        String name=sc.nextLine();
        int grade=sc.nextInt();
        sc.nextLine();
        student.put(name,grade);
        System.out.println("Retrive :");
        String retrive=sc.nextLine();
        System.out.println(retrive +" grade : "+student.get(retrive));
        System.out.println("All students and grades:");
        for(Map.Entry<String, Integer> entry : student.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
