//Create a BiConsumer<Integer, Integer> that takes two numbers and prints their sum.
//Input:
//3, 5
//Output : Sum of 3 and 5 is 8

import java.util.function.BiConsumer;

public class SumOfNumber {
    public static void main(String[] args){
        BiConsumer<Integer,Integer> biConsumer=(num1,num2)->System.out.print(num1+num2);
        biConsumer.accept(5,3);
    }
}
