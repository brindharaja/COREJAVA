//Java nio
//Steps:
//Using any two buffers for Reading and Writing Data

import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class JavaNio {
    public static void main(String[] args){
        IntBuffer buffer1=IntBuffer.allocate(10);
        CharBuffer buffer2= CharBuffer.allocate(10);
        buffer1.put(5);
        buffer2.put("I");
        buffer1.flip();
        buffer2.flip();
        System.out.println("Buffer 1: "+buffer1.get());
        System.out.println("Buffer 2: "+buffer2.get());
    }
}
