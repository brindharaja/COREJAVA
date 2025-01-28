//Use Date and Time API, Factory Methods, and Streams to build a simple scheduling system.
//Create a class Event with fields name, dateTime, and duration.
//Create a list of events using List.of().
//Provide the following functionality:
//Display all events.
//Filter events based on a specific date.
//Calculate the duration between events using Duration.between.

import java.time.*;
import java.util.List;
import java.util.stream.Collectors;

public class Event {
    String name;
    LocalDateTime dateTime;
    Duration duration;
    public Event(String name, LocalDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public Duration getDuration() {
        return duration;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return  name  +
                " , " + dateTime +
                " , " + duration ;
    }
    public static void main(String[] args) {
        List<Event> events=List.of(new Event("Meeting",LocalDateTime.now(),Duration.ofHours(1)),new Event("WorkShop",LocalDateTime.now().plusHours(5),Duration.ofHours(2)));
        events.forEach(System.out::println);
        System.out.println("--------------");
        System.out.println("Events on "+LocalDate.now());
        events.stream().filter(s->s.getDateTime().toLocalDate().equals(LocalDate.now())).map(Event::getName).forEach(System.out::println);
        System.out.println("Duration Between Events:");
        Duration durationBetween=Duration.between(events.get(0).getDateTime(),events.get(1).getDateTime());
        System.out.println(events.get(0).getName()+" - "+events.get(1).getName()+" : "+durationBetween.toHoursPart()
                +" hours "+durationBetween.toMinutesPart()+" mins");
    }
}