//Define an enum Day with values for all days of the week.
//Write a program to print a message like "It's a weekday"
// or "It's a weekend" based on the day.

public class Enum {
    enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
    public static String display(Day day){
        if(day==Day.SATURDAY || day==Day.SUNDAY){
            return "It's a weekend";
        }
        return "It's a weekday";
    }
    public static void main(String[] args){
        System.out.println("Monday: "+display(Day.MONDAY));
        System.out.println("Sunday: "+display(Day.SUNDAY));
    }
}
