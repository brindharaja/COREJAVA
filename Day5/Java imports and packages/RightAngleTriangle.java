//Use Math class methods like sqrt() and pow() in a program to
//calculate the hypotenuse of a right-angled triangle using static imports.
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class RightAngleTriangle {
    public static double Area(double base,double height){
        return sqrt(pow(base,2)+pow(height,2));
    }
    public static void main(String[] args){
        System.out.println(RightAngleTriangle.Area(5,5));
    }
}
