interface animal{
    abstract void eat();
    abstract void sleep();
}
public class dog implements animal{
    public void eat(){
        System.out.println("Dog eating" );
    }
    public void sleep(){
        System.out.println("Dog sleeping");
    }
}
class cat implements animal{
    public void eat(){
        System.out.println("cat eating" );
    }
    public void sleep(){
        System.out.println("cat sleeping");
    }
}
class InterfaceAnimal{
    public static void main(String[] args){
        dog obj1=new dog();
        obj1.eat();
        obj1.sleep();
        cat obj2=new cat();
        obj2.eat();
        obj2.sleep();

    }
}
