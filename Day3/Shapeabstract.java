public abstract class Shapeabstract {
 abstract double area();
}
class circle extends Shapeabstract{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class rectangle extends Shapeabstract{
    double length;
    double breadth;
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length*breadth;
    }
}
class abstractmain{
    public static void main(String[] args){
        circle obj1=new circle(5.0);
        System.out.println(obj1.area());
        Rectangle obj2=new Rectangle(4.0,5.0);
        System.out.println(obj2.area());

    }
}
