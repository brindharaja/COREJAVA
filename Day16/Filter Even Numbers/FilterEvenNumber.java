//Filter Even Numbers
//Write a program to filter all even numbers from a list of integers using a Predicate. Use a higher-order function to perform the filtering.
//Input: [12, 45, 22, 35, 60]
//Output: [12, 22, 60]

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class FilterEvenNumber {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(22);
        list.add(35);
        list.add(60);
        printNum(list,(num)->num%2==0);
    }
    public static void printNum(List<Integer> list,IntPredicate predicate){
        for(Integer n:list){
            if(predicate.test(n)){
                System.out.print(n+" ");
            }
        }
    }
}