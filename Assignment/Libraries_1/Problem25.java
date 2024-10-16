package Libraries_1;

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder names = new StringBuilder();
        
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("END")) {
                break;
            }
            if (names.length() > 0) {
                names.append("-");
            }
            names.append(name);
        }

        System.out.println(names.toString());
        scanner.close();
    }
}
