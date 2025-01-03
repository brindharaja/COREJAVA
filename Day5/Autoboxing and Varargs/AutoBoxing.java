//Write a program to add a list of integers using a List<Integer> and
//demonstrate how autoboxing allows seamless addition of primitive int.


import java.util.ArrayList;
import java.util.List;
public class AutoBoxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        System.out.print(sum);

    }
}
