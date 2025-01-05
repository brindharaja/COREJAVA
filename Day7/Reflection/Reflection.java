//Write a Java program to demonstrate the use of reflection. Your program should:
//Dynamically load a custom class (e.g., Person) using its fully qualified name.
//Display the following details about the class:
//All declared methods and their return types.
//All declared fields and their types.
//All constructors.
//Dynamically invoke a method on an object of the class, provided the method name and arguments as input.

import java.lang.reflect.*;
public class Reflection {
    public static void main(String[] args) {
        try{
            Class person=Class.forName("Person");
            Constructor cons[]=person.getDeclaredConstructors();
            for(int i=0;i<cons.length;i++){
                System.out.println(cons[i]);
            }
            Field fields[] = person.getDeclaredFields();
            for(int i=0;i< fields.length;i++){
                System.out.println(fields[i].getName()+" : "+fields[i].getType());
            }
            Method method[]= person.getDeclaredMethods();
            for(int i=0;i< method.length;i++){
                System.out.println(method[i].getName()+" : "+method[i].getReturnType());
            }
            Person per=(Person) cons[1].newInstance("Joo",23);
            for(int i=0;i< method.length;i++){
                if(method[i].getName().indexOf("getName")!=-1){
                    method[i].invoke(per);
                }
            }
        }catch(Exception e){
            System.out.println("Exception Found!.");
        }
    }
}