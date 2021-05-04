package main;

import exceptions.OutOfBoundsException;

// class that operates on pi
public class Pi {

    // EFFECTS: Returns the decimal at position i in pi, starting from 0.
    public static String findNthPiDigit(int i) throws OutOfBoundsException {
        if (i > 16 || i < 0) {
            throw new OutOfBoundsException(i);
        } else {
            String pi = Double.toString(Math.PI);
            int position = i;
            return pi.substring(position, position + 1);
        }
    }
}
