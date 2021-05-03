package main;

import java.util.ArrayList;
import java.util.List;

public class Value {
    private int value;
    private List<Integer> primeFactors;

    public Value(int value) {
        this.value = value;
        primeFactors = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: finds all the prime factors of value
    public void findPrimeFactors() {
        int currentValue = value;

        while (currentValue != 1) {
            int primeValue = firstPrimeFactor(currentValue);
            primeFactors.add(primeValue);
            currentValue /= primeValue;
        }

        primeFactors.add(1);
    }

    // EFFECTS: returns the first integer that divides value without a remainder.
    public int firstPrimeFactor(int value) {
        int prime = value;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                prime = i;
                break;
            }
        }
        return prime;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPrimeFactors() {
        return primeFactors;
    }
}
