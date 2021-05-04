package tests;

import exceptions.OutOfBoundsException;
import main.Pi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PiTest {

    @Test
    void testFindNthDigitNoExceptionThrown() {
        try {
            assertEquals("3", Pi.findNthPiDigit(0));
            assertEquals("1", Pi.findNthPiDigit(4));
            assertEquals("3", Pi.findNthPiDigit(16));
        } catch (OutOfBoundsException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    void testFindNthDigitOutOfBoundsExceptionThrown() {
        try {
            Pi.findNthPiDigit(-5);
            fail("OutOfBoundsException should have been thrown.");
        } catch (OutOfBoundsException e) {
            // expected
        }

        try {
            Pi.findNthPiDigit(17);
            fail("OutOfBoundsException should have been thrown.");
        } catch (OutOfBoundsException e) {
            // expected
        }
    }
}
