interface Constants{
    double pi=3.14;
}
public class CircleShape implements Constants {
    double radius;
    CircleShape(double radius){
        this.radius=radius;
    }
    public double Shape(){
        return pi*radius*radius;
    }
}
class CalculateArea{
    public static void main(String[] args){
        CircleShape obj1=new CircleShape(12);
        System.out.println(obj1.Shape());
    }
}
