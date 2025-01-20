//Transform a List of Names
//Write a method that takes a list of student names and transforms each name into uppercase letters with a prefix like "Student: " using map.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameTransformation {
    String name;
    public NameTransformation(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void display(List<String> transformedNames) {
        System.out.println("Transformed Student Names:");
        for (String name : transformedNames) {
            System.out.println(name);
        }
    }
    public static void main(String[] args){
        NameTransformation name1=new NameTransformation("bob");
        NameTransformation name2=new NameTransformation("alice");
        NameTransformation name3=new NameTransformation("eve");
        List<NameTransformation> l=new ArrayList<NameTransformation>();
        l.add(name1);
        l.add(name2);
        l.add(name3);
        List<String> transformedNames = l.stream()
                .map(student -> "Student: " + student.getName().toUpperCase())
                .collect(Collectors.toList());
        display(transformedNames);
    }
}
