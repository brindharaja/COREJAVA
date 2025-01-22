//Using Optional with Default Values
//Write a program that uses Optional to provide a default value of "Guest" when no name is provided.

import java.util.Optional;

public class OptionalExample2 {
    String name;
    public OptionalExample2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args){
        OptionalExample2 op=new OptionalExample2(null);
        Optional<String> optional=Optional.ofNullable(op.getName());
        if(optional.isPresent()){
            System.out.println(op.getName());
        }else{
            System.out.println("Guest");
        }
    }
}
