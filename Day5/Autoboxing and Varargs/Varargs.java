//Create a method sum(int... numbers) that takes a variable
// number of integers as input and returns their sum.
// Test it with different numbers of arguments.

public class Varargs {
    static int num;
    public static int sum(int... numbers){
        for(int num:numbers){
           num++;
        }
        return num;
    }
    public static void main(String[] args){
        System.out.println(Varargs.sum(10,10));
        System.out.println(Varargs.sum(10,10,10,10));
    }
}
