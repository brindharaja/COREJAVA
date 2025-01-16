import FactorialCalculator.Factorial;
import static org.junit.Assert.assertEquals;
public class TestFactorial {
    @org.junit.jupiter.api.Test
    public void testAllCases() {
        assertEquals(120, Factorial.FactNum(5));
        assertEquals(0,Factorial.FactNum(0));
        assertEquals(-7,Factorial.FactNum(-7));
        assertEquals(720,Factorial.FactNum(6));
        assertEquals(40320,Factorial.FactNum(8));
    }
}
