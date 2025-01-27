//Given a list of integers, perform the following tasks using parallel streams:
//Filter numbers greater than 50.
//Map these numbers to their squares.
//Print the first 10 squared numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args){
        List<Integer> listNum = Arrays.asList(10,50,80,90,40,60,90,8000,300,70,450,95);
        List<Integer> res=listNum.parallelStream().filter(num->num>50).map(num->num*num).limit(10).collect(Collectors.toList());
        res.forEach(System.out::println);
    }
}
