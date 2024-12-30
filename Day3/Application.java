public abstract class Application {
    abstract void turnOn();
    void turnOff(){
        System.out.println("Fan : turnOff");
    }
}
class fan extends Application{
    void turnOn(){
        System.out.println("Fan : turnOn");
    }
}
class fanApp{
    public static void main(String[] args){
        fan obj1=new fan();
        obj1.turnOn();
    }
}

