public class Animal {
    public void speak(){
        System.out.println("Animal makes a sound");
    }
    public static void main(String[] args){
        Animal dog=new Dog();
        Animal cat=new Cat();
        dog.speak();
        cat.speak();
    }
}
class Dog extends Animal{
    public void speak(){
        System.out.println("Dog : barks");
    }
}
class Cat extends Animal{
    public void speak(){
        System.out.println("Cat : meow");
    }
}
