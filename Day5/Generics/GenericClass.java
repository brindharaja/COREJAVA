//Create a generic class Pair<K, V> to hold a key-value pair.
// Write a program to store and display pairs of different
// data types, like <String, Integer> or <Integer, String>.

class Pair<K,V>{
    K key;
    V value;

    Pair(K key,V value){
        this.key=key;
        this.value=value;
    }

    void display(){
        System.out.println("key: "+key+" value: "+value);
    }
}
public class GenericClass {
    public static void main(String[] args){
        Pair<String,Integer> p1=new Pair<>("Bindu",2004);
        Pair<Integer,String> p2=new Pair<>(2001,"Joo");
        p1.display();
        p2.display();
    }

}
