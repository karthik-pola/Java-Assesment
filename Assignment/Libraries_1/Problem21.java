package Libraries_1;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String marksString = scanner.nextLine();
        String[] marksArray = marksString.split(",");
        int total = 0;

        for (String mark : marksArray) {
            total += Integer.parseInt(mark.trim());
        }

        System.out.println("Total Marks: " + total);
        scanner.close();
    }

}
