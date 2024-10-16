package Libraries_1;

import java.util.Scanner;

public class Problem23 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder inv = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                inv.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                inv.append(Character.toUpperCase(c));
            } else {
                inv.append(c);
            }
        }

        System.out.println(inv.toString());
        scanner.close();
    }
}
