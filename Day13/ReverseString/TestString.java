import StringReverseChecker.StringReverse;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class TestString {
    @Test
    public void testAllCases() {
        assertEquals("olleH", StringReverse.reverseOfString("Hello"));
        assertEquals("", StringReverse.reverseOfString(""));
        assertEquals("A", StringReverse.reverseOfString("A"));
        assertEquals("@#*", StringReverse.reverseOfString("*#@"));
        assertEquals("String", StringReverse.reverseOfString("madam"));
    }
}
