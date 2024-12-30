interface veehicle{
    abstract void start();
}
interface FourWheeler extends veehicle{
    abstract void FStart();
}
interface TwoWheeler extends veehicle{
    abstract void TStart();
}
class CarFourWheeler implements FourWheeler{
    public void start(){
        System.out.println("FourWheeler started");
    }
    public void FStart(){
        System.out.println("Car Started");
    }
}
class BikeTwoWheeler implements TwoWheeler{
    public void start(){
        System.out.println("TwoWheeler started");
    }
    public void TStart(){
        System.out.println("Bike Started");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args){
        CarFourWheeler obj1=new CarFourWheeler();
        obj1.start();
        obj1.FStart();
        BikeTwoWheeler obj2=new BikeTwoWheeler();
        obj2.start();
        obj2.TStart();

    }
}

