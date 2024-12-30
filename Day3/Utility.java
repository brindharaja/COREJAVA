public class Utility {
    static String str;
    static{
        str="helloworld";
    }
    static String convert(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args){
        Utility uppercase=new Utility();
        System.out.print(uppercase.convert(str));
    }
}
