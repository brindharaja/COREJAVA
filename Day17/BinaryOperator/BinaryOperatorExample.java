//BinaryOperator
//Create a program using a BinaryOperator to find the maximum of two integers.

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args){
        BinaryOperator<Integer> binaryOperator=(obj1,obj2)->obj1+obj2;
        System.out.println(binaryOperator.apply(5,5));

    }
}
