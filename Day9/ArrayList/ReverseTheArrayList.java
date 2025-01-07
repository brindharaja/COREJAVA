//Create a program that reverses the order of elements in an ArrayList.
//Input Example:
//Input list: [1, 2, 3, 4, 5]
//Output Example:
//Reversed List: [5, 4, 3, 2, 1]

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseTheArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<no;i++){
            int n=sc.nextInt();
            a.add(n);
        }
        System.out.println(a.reversed().toString());
    }
}
