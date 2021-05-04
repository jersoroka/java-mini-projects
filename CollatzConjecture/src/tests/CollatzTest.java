package tests;

import main.Collatz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CollatzTest {

    @Test
    void testCounterValueGreaterThanOne() {
        try {
            assertEquals(1, Collatz.counter(2));
            assertEquals(6, Collatz.counter(10));
            assertEquals(111, Collatz.counter(1000));
        } catch (Exception e) {
            fail("No exception should be thrown.");
        }
    }

    @Test
    void testCounterThrowException() {
        try {
            Collatz.counter(1);
            fail("Exception should be thrown");
        } catch (Exception e) {
            // expected
        }

        try {
            Collatz.counter(-10);
            fail("Exception should be thrown");
        } catch (Exception e) {
            // expected
        }
    }
}
