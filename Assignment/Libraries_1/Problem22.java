package Libraries_1;

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                System.out.println("Space at position: " + i);
            }
        }

        scanner.close();
    }   
}
