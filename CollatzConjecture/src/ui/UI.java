package ui;

import main.Collatz;

import java.util.Scanner;

public class UI {
    private Scanner scanner = new Scanner(System.in);

    // EFFECTS: console interface to type in the value to apply the Collatz conjecture towards.
    public UI() {
        boolean keepGoing = true;

        while (keepGoing) {
            try {
                System.out.println("Please enter an integer greater than 1 to initiate the Collatz conjecture.");
                int next = scanner.nextInt();

                int steps = Collatz.counter(next);
                System.out.println("It takes " + steps + " steps to reach 1.");
            } catch (Exception e) {
                System.out.println("Please enter an integer greater than 1.");
            }
        }
    }
}
