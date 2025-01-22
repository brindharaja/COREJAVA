//Handling Null with Optional
//Write a program that accepts a String input, converts it to uppercase if it's not null,and prints "Empty input" if the string is null.

import java.util.Optional;

public class OptionalExample1 {
    String name;
    OptionalExample1(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args){
        OptionalExample1 optionalExample1=new OptionalExample1("helloworld");
        Optional<String> optional=Optional.ofNullable(optionalExample1.getName());
        if(optional.isPresent()){
            System.out.println(optionalExample1.getName().toUpperCase());
        }else{
            System.out.println("Empty input");
        }


    }
}
