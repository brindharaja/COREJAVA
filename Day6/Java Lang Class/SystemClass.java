// Print a message to the console and measure the execution time of a simple loop using System.currentTimeMillis().

public class SystemClass {
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
