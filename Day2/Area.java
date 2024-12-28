import java.util.*;
public class Area {
    public double rectangle(double b,double l){
        return l*b;
    }
    public double circle(double r){
        return 3.14*r*r;
    }
    public double triangle(double b,double l){
        return 0.5*b*l;
    }
    public static void main(String[] args){
        Area area=new Area();
        System.out.println("Rectangle: "+area.rectangle(5.0,6.0));
        System.out.println("Circle: "+area.circle(4));
        System.out.println("Triangle: "+area.triangle(6,7));

    }
}
