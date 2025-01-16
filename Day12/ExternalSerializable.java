//External Serializable a Java Object
//Steps:
//writeExternal(ObjectOutput out) for writing object data.
//readExternal(ObjectInput in) for reading object data.

import java.io.*;

public class ExternalSerializable implements Externalizable {
    int id;
    public ExternalSerializable(){
        System.out.println("no-argument");
    }
    ExternalSerializable(int id){
        this.id=id;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        System.out.println("Data serialization");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id=in.readInt();
        System.out.println("Data Deserialization");
    }
    public void display() {
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        ExternalSerializable obj = new ExternalSerializable(2500);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("externalObj.ser"))) {
            oos.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("externalObj.ser"))) {
            ExternalSerializable deserializedObj = (ExternalSerializable) ois.readObject();
            System.out.println("Object deserialized successfully.");
            deserializedObj.display();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
