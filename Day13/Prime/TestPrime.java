import PrimeChecker.PrimeNumber;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestPrime {
    @Test
    public void testAllCases() {
        assertFalse(PrimeNumber.isPrime(29));
        assertFalse(PrimeNumber.isPrime(-5));
        assertFalse(PrimeNumber.isPrime(0));
        assertFalse(PrimeNumber.isPrime(1));
        assertTrue(PrimeNumber.isPrime(1532));


    }
}
