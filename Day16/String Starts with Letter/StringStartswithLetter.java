//String Starts with Letter
//Create a method that takes a Predicate<String> and a list of strings and filters out all strings that start with a particular letter (e.g., 'A').
//Input: ["Apple", "Banana", "Avocado", "Cherry"]
//Letter: 'A'
//Output: ["Apple", "Avocado"]

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringStartswithLetter {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Alice");
        list.add("Ammy");
        list.add("Bob");
        list.add("Rose");
        list.add("Eve");
        Predicate<String> predicate=(name)->name.startsWith("A");
        printName(list,predicate);
    }
    public static void printName(List<String> list,Predicate<String> predicate){
        for(String name:list){
            if(predicate.test(name)){
                System.out.println(name);
            }
        }
    }
}
