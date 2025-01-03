//Create a program that demonstrates:
//Creating an object of a class.
//Using the basic methods of the Object class: getClass() and toString().

public class Object {
    String A;
    String B;
    Object(String A,String B){
        this.A=A;
        this.B=B;
    }

    @Override
    public String toString() {
        return "Object{" + "A='" + A + '\'' + ", B='" + B + '\'' + '}';
    }

    public static void main(String[] args){
        Object obj=new Object("Hello","Worlds");
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
    }
}
