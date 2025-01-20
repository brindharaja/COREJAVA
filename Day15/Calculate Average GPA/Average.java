//Calculate Average GPA
//Write a method that calculates the average GPA of a list of students using a lambda expression.

import java.util.ArrayList;
import java.util.List;

public class Average {
    double gpa;
    public Average(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public static void main(String[] args){
        Average s1=new Average(85.9);
        Average s2=new Average(75.4);
        Average s3=new Average(83.6);
        List<Average> list=new ArrayList<Average>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        double avg=list.stream().mapToDouble(Average::getGpa).average().orElse(0.0);
        System.out.println(avg);

    }

}
