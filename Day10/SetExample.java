//Create a program that uses a Set to store a collection of unique names.
//Implement the following features:
//Add names to the set.
//Check if a name is already present in the set.
//Display all unique names in the set.
//Input Example:
//Add names: "Alice", "Bob", "Alice", "Eve", "Charlie".
//Output Example:
//Unique Names: [Alice, Bob, Eve, Charlie]

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Add Names : ");
        Set<String> s=new HashSet<>();
        String str=sc.nextLine();
        String[] s1=str.split(",");
        for(String s2:s1){
            s.add(s2);
        }
        System.out.println("Unique Names : "+s.toString());
    }
}
