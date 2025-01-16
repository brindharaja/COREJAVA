package StringReverseChecker;
public class StringReverse {
    public static String reverseOfString(String str1) {
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            str2 = str1.charAt(i) + str2;
        }
        return str2;
    }
    public static void main(String[] args) {
        System.out.println(reverseOfString(""));
        System.out.println(reverseOfString("Hello"));
        System.out.println(reverseOfString("A"));
        System.out.println(reverseOfString("Hello#@"));
        System.out.println(reverseOfString("String"));
    }
}
