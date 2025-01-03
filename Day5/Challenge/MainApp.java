import Utility.*;
public class MainApp {
    public static void main(String[] args){
        Container<String> container1=new Container<>("String");
        Container<Integer> container2=new Container<>(10);
        container1.display();
        container2.display();
        System.out.println(Container.Priority.LOW);
    }
}
