public class Counter {
    public static int count;
    static{
        count=0;
    }
    Counter(){
        count++;
    }
    public static void main(String[] args) {
        Counter count1=new Counter();
        Counter count2=new Counter();
        Counter count3=new Counter();
        System.out.print(count);

    }
}