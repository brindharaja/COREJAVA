//Find Students with Names Starting with a Letter
//Write a method that finds all students whose names start with a specific letter.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartName {
    String name;
    public FindStartName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void display(List<String> studentsWithLetter) {
        studentsWithLetter.forEach(name -> {
            System.out.println(name);
        });
    }
    public static void main(String[] args){
        FindStartName s1=new FindStartName("Ammy");
        FindStartName s2=new FindStartName("Alice");
        FindStartName s3=new FindStartName("Rose");
        FindStartName s4=new FindStartName("Lisa");
        List<FindStartName> list=new ArrayList<FindStartName>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        List<String> studentsWithLetter = list.stream().map(FindStartName::getName).filter(name -> name.startsWith(String.valueOf('A'))).collect(Collectors.toList());
        display(studentsWithLetter);
    }
}
