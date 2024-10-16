package Libraries_1;

import java.util.Random;
import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1;
        int attempts = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 25. You have 3 attempts.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("The number is higher");
            } else {
                System.out.println("The number is lower");
            }

            if (i == attempts) {
                System.out.println("Sorry! The number was " + randomNumber );
            }
        }

        scanner.close();
    }
    
}
