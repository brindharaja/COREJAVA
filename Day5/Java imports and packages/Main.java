//Create and Use Packages:
//Create a package shapes with two classes:
//Circle with a method to calculate the area of a circle.
//Rectangle with a method to calculate the area of a rectangle.
//Write a Main class in the default package to import and use these classes.
import Shape.Circle;
import Shape.Rectangle;
public class Main {
    public static void main(String[] args){
        System.out.println(Circle.Area(5.5));
        System.out.println(Rectangle.Area(5.5,4.5));
    }
}
