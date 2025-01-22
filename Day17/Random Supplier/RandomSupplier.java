//Random Supplier
//Create a Supplier that generates a random number between 1 and 100 and prints it 5 times.

import java.util.Random;
import java.util.function.Supplier;
public class RandomSupplier {
    public static void main(String[] args){
        Supplier<Integer> randonNumber=()->new Random().nextInt(100);
        int i=0;
        while(i<5){

            System.out.println(randonNumber.get());
            i++;
        }
    }
}
