//Find the Top Scorer in Each Department
//Write a method that groups students by department and finds the top scorer in each department using Collectors.groupingBy and maxBy.

import java.util.*;
import java.util.stream.Collectors;

public class TopScorer {
    String name;
    String subject;
    double mark;
    public TopScorer(String name, String subject, double mark) {
        this.name = name;
        this.subject = subject;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String toString() {
        return name + " (" + mark + ")";
    }

    public static void main(String[] args){
        TopScorer topScorer1=new TopScorer("Bindu","oops",89);
        TopScorer topScorer2=new TopScorer("Bindu","os",75);
        TopScorer topScorer3=new TopScorer("Bindu","DBMS",84);
        TopScorer topScorer4=new TopScorer("Jo","oops",79);
        TopScorer topScorer5=new TopScorer("Jo","oops",80);
        TopScorer topScorer6=new TopScorer("Jo","DBMS",89);
        List<TopScorer> list =new ArrayList<TopScorer>();
        list.add(topScorer1);
        list.add(topScorer2);
        list.add(topScorer3);
        list.add(topScorer4);
        list.add(topScorer5);
        list.add(topScorer6);
        Map<String, Optional<TopScorer>> topScorersBySubject = list.stream()
                .collect(Collectors.groupingBy(
                        TopScorer::getSubject,
                        Collectors.maxBy(Comparator.comparingDouble(TopScorer::getMark))
                ));
        topScorersBySubject.forEach((subject, topScorer) ->
                System.out.println(subject + ": " + topScorer.orElse(null))
        );
    }
}
