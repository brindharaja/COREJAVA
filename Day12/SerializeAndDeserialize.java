//Serialize and Deserialize a Java Object
//Steps:
//Create a class that implements the Serializable interface.
//Serialize the object to a file using ObjectOutputStream.
//Deserialize the object from the file using ObjectInputStream.

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class SerializeAndDeserialize implements Serializable {
    int id;
    SerializeAndDeserialize(int id){
        this.id=id;
    }
    public void display(){
        System.out.println("ID :"+id);
    }
    public static void main(String[] args){
        SerializeAndDeserialize obj1=new SerializeAndDeserialize(10);
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("obj1.ser"))){
            oos.writeObject(obj1);
            System.out.println("obj1 object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj1.ser"))) {
            SerializeAndDeserialize deserializedObj = (SerializeAndDeserialize) ois.readObject();
            System.out.println("Object deserialized successfully.");
            deserializedObj.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
