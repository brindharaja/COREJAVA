//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Area {
    public Area() {
    }

    public double rectangle(double b, double l) {
        return l * b;
    }

    public double circle(double r) {
        return 3.14 * r * r;
    }

    public double triangle(double b, double l) {
        return (double)0.5F * b * l;
    }

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Rectangle: " + area.rectangle((double)5.0F, (double)6.0F));
        System.out.println("Circle: " + area.circle((double)4.0F));
        System.out.println("Triangle: " + area.triangle((double)6.0F, (double)7.0F));
    }
}
