import exceptions.OutOfBoundsException;

public class Pi {

    // EFFECTS: Returns the decimal at position i in pi. That is, the first decimal value is position 0, and so on.
    public static String findNthPiDigit(int i) throws OutOfBoundsException {
        if (i >= 14) {
            return "The highest decimal that can be obtained is at position 14. Please enter a new position number.";
        } else {
            String pi = Double.toString(Math.PI);
            int position = 2 + i;
            return pi.substring(position, position + 1);
        }
    }
}
