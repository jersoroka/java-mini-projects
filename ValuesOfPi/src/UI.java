import java.util.Scanner;

public class UI {
    private final Scanner scanner = new Scanner(System.in);

    public UI() {
        boolean keepGoing = true;

        while (keepGoing) {
            try {
                System.out.println("Which digit of pi do you want (starting from the decimal point)? That is, position 0 corresponds to 1 and so on. Note that the highest position to search is 14.");

                int next = scanner.nextInt();

                System.out.println("The decimal digit at position " + next + " is " + Pi.findNthPiDigit(next));
            } catch (Exception e) {
                System.out.println("Invalid entry");
            }
        }
    }
}
