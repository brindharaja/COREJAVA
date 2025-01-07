//You are tasked with creating a program to manage student grades using a Vector in Java.
// Implement the following functionalities:
//Add grades (as integers) to a vector dynamically.
//Print all grades in the vector.
//Calculate and display:
//The highest grade.
//The lowest grade.
//The average grade.
//Allow the user to remove a specific grade by its index.
//Input Example:
//Add grades: 78, 85, 92, 67, 88.
//Remove grade at index 3.
//Output Example:
//Grades: [78, 85, 92, 88]
//Highest Grade: 92
//Lowest Grade: 78
//Average Grade: 85.75

import java.util.Scanner;
import java.util.Vector;
public class GradeManagement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v=new Vector<>();
        int length=sc.nextInt();
        for(int i=0;i<length;i++){
            int n=sc.nextInt();
            v.add(n);
        }
        int index=sc.nextInt();
        v.remove(index);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double average=0;
        for(int i=0;i<v.size();i++){
            if(max<v.get(i)){
                max=v.get(i);
            }
            if(min>v.get(i)){
                min=v.get(i);
            }
            average=average+v.get(i);
        }
        System.out.println(v.toString());
        System.out.println("MaxValue :"+max+"\nMinValue :"+min+"\nAverage :"+average/v.size());
    }
}
