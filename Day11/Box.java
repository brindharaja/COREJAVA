//Create a Generic Box class that can hold a single object of any type. The class should:
//Be able to store any type of object, whether it's a String, Integer, Double, or any custom class.
//Provide methods to:
//setItem(T item): Store an item in the box.
//getItem(): Retrieve the stored item.
//printItem(): Print the item stored in the box.
//Implement a method to check if the stored item is of a specific type, for example, using instanceof.
//Requirements:
//The Box class should be generic to store any type of object.
//The class should support methods to set, get, and print the item.
//Implement a type check (isTypeOf) that returns true if the item is of a specified type.

public class Box<T> {
    T value;
    public void setItem(T item){
        this.value=item;
    }
    public T getItem(){
        return value;
    }
    public void printItem(){
        System.out.println(value);
    }
    public boolean isString() {
        return value instanceof String;
    }
    public boolean isInteger() {
        return value instanceof Integer;
    }
    public boolean isDouble() {
        return value instanceof Double;
    }
    public static void main(String[] args){
        Box<Double> doubleBox=new Box<>();
        Box<String> stringBox=new Box<>();
        Box<Integer> integerBox=new Box<>();
        doubleBox.setItem(2.5);
        stringBox.setItem("Hello");
        integerBox.setItem(50);
        doubleBox.printItem();
        stringBox.printItem();
        integerBox.printItem();
        System.out.println(doubleBox.isDouble());
        System.out.println(stringBox.isString());
        System.out.println(integerBox.isInteger());

    }
}
