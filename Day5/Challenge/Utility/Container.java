//Create a mini-application combining these topics:
//Use a package utilities containing a generic class Container<T> to store any object.
//Use an enum Priority with values LOW, MEDIUM, and HIGH.
//Use a Main class to demonstrate autoboxing, access modifiers, and package imports.

package Utility;
public class Container<T>{
    T value;

    public Container(T value) {
        this.value = value;
    }

    public void display(){
        System.out.println(value);
    }

    public enum Priority{
        LOW,
        MEDIUM,
        HIGH;
    }
}

