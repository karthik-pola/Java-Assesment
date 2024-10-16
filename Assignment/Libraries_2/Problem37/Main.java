package Libraries_2.Problem37;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "temp.txt";

        try (FileWriter file = new FileWriter(fileName, true);
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the numbers:");
            while (true) {
                int n = sc.nextInt();

                file.write(n + System.lineSeparator());
                file.flush();
            }
        }

        catch (IOException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
