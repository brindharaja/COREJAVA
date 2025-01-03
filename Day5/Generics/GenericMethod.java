//Write a generic method printArray(T[] array)
// to print elements of any array type.
// Test it with arrays of String, Integer, and Double.

public class GenericMethod {
    public static <T> void printArray(T[] array){
        for(T n:array){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        Integer[] integer={1,2,3};
        GenericMethod.printArray(integer);
        System.out.println();
        Character[] character={'A','B'};
        GenericMethod.printArray(character);
    }
}
