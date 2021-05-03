package ui;

import main.Value;
import main.exceptions.InvalidInputException;

import java.util.Scanner;

public class UI {
    private final Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            homePrompts();
            try {
                processHomeCommands();
                keepGoing = false;
            } catch (InvalidInputException e) {
                System.out.println("Invalid option");
            }
        }
    }

    public void homePrompts() {
        System.out.println("Which of the following operations would you like to do?");
        System.out.println("Enter '1' if you'd like to find all the prime factors of a number.");
        System.out.println("Enter '2' if you'd like to find the next prime number after a number.");
    }

    public void processHomeCommands() throws InvalidInputException {
        try {
            int input = scanner.nextInt();

            if (input == 1) {
                findPrimeFactors();
            } else if (input == 2) {
                findNextPrimeNumber();
            } else {
                throw new InvalidInputException();
            }
        } catch (Exception e) {
            throw new InvalidInputException();
        }
    }

    public void findPrimeFactors() {
        System.out.println("Please enter an integer to find factors for.");
        boolean keepGoing = true;

        while (keepGoing) {
            try {
                int input = scanner.nextInt();
                Value value = new Value(input);
                value.findPrimeFactors();
                System.out.println(value);
                resetProgramOption();
                keepGoing = false;
            } catch (Exception e) {
                // continue loop
            }
        }
    }

    public void findNextPrimeNumber() {
        System.out.println("Please enter an integer to find the nearest following prime number of.");
        boolean keepGoing = true;

        while (keepGoing) {
            try {
                int input = scanner.nextInt();
                int nextPrime = Value.findNextPrimeNumber(input);

                System.out.println("The next prime number after " + input + " is " + nextPrime);
                resetProgramOption();
                keepGoing = false;
            } catch (Exception e) {
                // continue loop
            }
        }
    }

    public void resetProgramOption() {
        System.out.println("Would you like to try another operation on a number? Enter 'y' for yes or 'n' for no");
        boolean keepGoing = true;

        while (keepGoing) {
            try {
                String input = scanner.nextLine().toLowerCase();

                if (input.equals("y")) {
                    new UI();
                    keepGoing = false;
                } else if (input.equals("n")){
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter either 'y' or 'n'");
            }
        }

    }


}
