package main;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

// represents an integer and a list of its prime factors
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
    public static int firstPrimeFactor(int value) {
        int prime = value;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                prime = i;
                break;
            }
        }
        return prime;
    }

    // EFFECTS: returns the next prime number of value
    public static int findNextPrimeNumber(int number) {
        int prime;
        int currentValue = number;

        while (true) {
            currentValue++;

            if (Value.firstPrimeFactor(currentValue) == currentValue) {
                prime = currentValue;
                break;
            }
        }
        return prime;
    }

    public List<Integer> getPrimeFactors() {
        return primeFactors;
    }
}
