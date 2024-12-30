public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Calculator al=new Calculator();
        System.out.println(al.add(5,5));
        System.out.println(al.add(5.40,5.40));
        System.out.println(al.add(5,5,5));
    }
}
