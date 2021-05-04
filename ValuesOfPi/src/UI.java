import exceptions.OutOfBoundsException;

import java.util.Scanner;

public class UI {
    private final Scanner scanner = new Scanner(System.in);

    public UI() {
        boolean keepGoing = true;

        while (keepGoing) {
            try {
                System.out.println("Which digit position of pi do you want to retrieve (starting from position 0)?");

                int next = scanner.nextInt();

                String digit = Pi.findNthPiDigit(next);
                System.out.println("The digit at position " + next + " is " + digit);
            } catch (OutOfBoundsException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid entry.");
            }
        }
    }
}
