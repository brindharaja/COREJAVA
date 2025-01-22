//UnaryOperator
//Write a Java program to use a UnaryOperator that converts a given string to uppercase.

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    String name;
    public UnaryOperatorExample(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args){
        UnaryOperatorExample unaryOp=new UnaryOperatorExample("helloworld");
        UnaryOperator<UnaryOperatorExample> unaryOperator=(obj)-> {
            obj.setName(obj.getName().toUpperCase());
            return obj;
        };
        UnaryOperatorExample u1=unaryOperator.apply(unaryOp);
        System.out.println(u1.getName());
    }
}
