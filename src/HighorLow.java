import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        Scanner in = new Scanner(System.in);
        int guess = 0;
        boolean done = false;

        do {
            System.out.print("Guess the number (1 to 10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine(); // clear the buffer
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                String trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a valid integer between 1 and 10.");
            }
        } while (!done);

        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("Your guess is correct!");
        }
    }
}
