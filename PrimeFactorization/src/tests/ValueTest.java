package tests;

import main.Value;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueTest {
    private Value testValue;

    @Test
    void testFindFirstPrimeNumberIsAPrimeFactor() {
        testValue = new Value(2);
        int testNumber = 2;

        assertEquals(2, testValue.firstPrimeFactor(testNumber));
    }

    @Test
    void testFindFirstPrimeNumberHasPrimeFactor() {
        testValue = new Value(9);
        int testNumber = 9;

        assertEquals(3, testValue.firstPrimeFactor(testNumber));
    }

    @Test
    void testFindPrimeFactors() {
        testValue = new Value(30);
        testValue.findPrimeFactors();
        assertTrue(testValue.getPrimeFactors().contains(2));
        assertTrue(testValue.getPrimeFactors().contains(3));
        assertTrue(testValue.getPrimeFactors().contains(5));
        assertTrue(testValue.getPrimeFactors().contains(1));
        assertEquals(4, testValue.getPrimeFactors().size());

        testValue = new Value(99);
        testValue.findPrimeFactors();
        assertTrue(testValue.getPrimeFactors().contains(3));
        assertEquals(2, countRepeats(testValue, 3));
        assertTrue(testValue.getPrimeFactors().contains(11));
        assertTrue(testValue.getPrimeFactors().contains(1));
        assertEquals(4, testValue.getPrimeFactors().size());
    }

    // EFFECTS: counts the number of instances of a given number in the prime factors of value
    public int countRepeats(Value value, int number) {
        int counter = 0;
        for (int i: value.getPrimeFactors()) {
            if (i == number) {
                counter++;
            }
        }
        return counter;
    }

}
