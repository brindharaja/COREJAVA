public class Animal {
    String sound(){
        return "Animal makes Sound";
    }
}
class Dog extends Animal{
    String sound(){
        return "Bark";
    }
}
class Cat extends Animal{
    String sound(){
        return "Meow";
    }
}
class animalmain{
    public static void main(String[] args){
        Animal obj=new Animal();
        System.out.println(obj.sound());
        Animal obj1=new Dog();
        System.out.println(obj1.sound());
        Animal obj2=new Cat();
        System.out.println(obj2.sound());
    }
}