//Use a Function<String, Integer> to map a list of strings to their lengths.
//Input: ["Hello", "World", "Java"]
//Output: [5, 5, 4]

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapList {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("Java");
        Function<String,Integer> function=(name)->name.length();
        printLength(list,function);
    }
    public static void printLength(List<String> list,Function<String,Integer> function){
        for(String name:list){
            System.out.println(function.apply(name));
        }
    }
}
