//Create a program where a method reference is used to compare strings (e.g., String::compareToIgnoreCase) in a list and sort them.

import java.util.ArrayList;
import java.util.List;

public class StringCompare {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.sort(String::compareToIgnoreCase);
        for(String s:list){
            System.out.println(s);
        }
    }
}
