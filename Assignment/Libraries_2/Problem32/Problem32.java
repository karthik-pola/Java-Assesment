package Libraries_2.Problem32;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'O' to finish):");

        double sum = Stream.generate(scanner::nextLine)
                .takeWhile(input -> !input.equalsIgnoreCase("0"))
                .mapToDouble(input -> {
                    try {
                        return Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        return 0; // return 0 for invalid input
                    }
                })
                .filter(num -> num > 0)
                .sum();

        System.out.println("Sum of positive numbers: " + sum);

        // Scanner scanner = new Scanner(System.in);
        // double sum = 0;

        // while (true) {
        // System.out.println("Enter a number:");
        // String input = scanner.nextLine();

        // if (input.equalsIgnoreCase("O")) {
        // break;
        // }

        // try {
        // double number = Double.parseDouble(input);
        // if (number > 0) {
        // sum += number;
        // }
        // } catch (NumberFormatException e) {
        // System.out.println("Invalid input.");
        // }
        // }

        // System.out.println("Sum of positive numbers: " + sum);
    }

}
