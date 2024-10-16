package Libraries_2.Problem34;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name.");
        int count_lower = 0;
        int count_upper = 0;
        int count_digit = 0;

        String filename = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isLowerCase(line.charAt(i))) {
                        count_lower++;
                    } else if (Character.isDigit(line.charAt(i))) {
                        count_digit++;
                    } else {
                        count_upper++;

                    }
                }
            }
        } catch (IOException e) {

        }

        finally {
            System.out.println("Number of lower case letters: " + count_lower);
            System.out.println("Number of upper case letters: " + count_upper);
            System.out.println("Number of  digits: " + count_digit);
            sc.close();
        }
    }

}
