public class Shape {
    public double area(){
        return 0;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length*breadth;
    }
}
class Square extends Rectangle{
    double side;
    Square(double side){
        super(side,side);
    }

}
class ShapeMain{
    public static void main(String[] args){
        Shape obj1=new Rectangle(2.5,4.5);
        System.out.println(obj1.area());
        Shape obj2=new Square(5);
        System.out.println(obj2.area());
    }
}

