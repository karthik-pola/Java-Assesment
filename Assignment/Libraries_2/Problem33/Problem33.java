package Libraries_2.Problem33;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "names.txt";

        try (FileWriter writer = new FileWriter(filename, true)) {
            System.out.println("Enter names \"Press Ctrl+C to exit:\"");
            while (true) {
                String line = scanner.nextLine();
                writer.write(line + System.lineSeparator());
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
