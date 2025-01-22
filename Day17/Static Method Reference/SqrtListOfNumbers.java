//Static Method Reference
//Write a Java program that uses a method reference to a static method Math::sqrt to calculate the square root of a list of numbers.

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;

public class SqrtListOfNumbers {
    public static void main(String[] args){
        List<Double> list=new ArrayList<>();
        list.add(4.0);
        list.add(9.0);
        list.add(16.0);
        for(Double num:list){
            DoubleFunction<Double> intFunction=Math::sqrt;
            Double res=intFunction.apply(num);
            System.out.println(res);
        }
    }
}
