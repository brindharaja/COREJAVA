//Create an enum Season with values WINTER, SPRING, SUMMER, and FALL.
//Add a method getAverageTemperature() to return an average temperature for each season.

public class Temperature {
    enum Season{
        WINTER, SPRING, SUMMER, FALL;
    }
    public static String getAverageTemperature(Season season){
        switch(season){
            case WINTER:
                return "10-15 C";
            case SPRING:
                return "32 C";
            case SUMMER:
                return "32-40 C";
            case FALL:
                return "16-27 C";
            default:
                return "Invalid";
        }
    }
    public static void main(String[] args){
        System.out.println("Winter: "+getAverageTemperature(Season.WINTER));
        System.out.println("Spring: "+getAverageTemperature(Season.SPRING));
        System.out.println("Summer: "+getAverageTemperature(Season.SUMMER));
        System.out.println("Fall: "+getAverageTemperature(Season.FALL));
    }
}
