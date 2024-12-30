interface Printer{
    abstract void print();
}
interface Scanner{
    abstract void scan();
}
public class AllInOne implements Printer,Scanner{
    public void print(){
        System.out.println("Printer used to print");
    }
    public void scan(){
        System.out.println("Scanner used to scan");
    }
}
class MultipleInheritance{
    public static void main(String[] args){
        AllInOne obj1=new AllInOne();
        obj1.print();
        obj1.scan();
    }
}
//Create two interfaces Printer with a method print()
// and Scanner with a method scan().
// Create a class AllInOne that implements both interfaces.