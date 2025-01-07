//Create a program to find the maximum element in an ArrayList of integers.
//Input Example:
//Input list: [15, 22, 8, 42, 17]
//Output Example:
//Maximum Element: 42

import java.util.*;
public class MaxElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<no;i++){
            int n=sc.nextInt();
            a.add(n);
        }
        Collections.sort(a);
        System.out.print(a.get(a.size()-1));
    }
}
