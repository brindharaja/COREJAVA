package FactorialCalculator;

public class Factorial {
    public static int FactNum(int num){
        if(num<=1){
            return num;
        }
        return num*FactNum(num-1);
    }
    public static void main(String[] args){
        System.out.println(FactNum(5));
        System.out.println(FactNum(0));
        System.out.println(FactNum(-7));
        System.out.println(FactNum(6));
        System.out.println(FactNum(8));
    }
}
