package Libraries_2.Problem36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "Marks.txt";
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] marks = line.split(","); // Split the line by comma

                for (String mark : marks) {
                    try {
                        sum += Integer.parseInt(mark.trim()); // Trim whitespace and parse
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid mark: " + mark);
                    }
                }

                // System.out.println("Total marks for line: " + sum);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        finally {
            System.out.println("Total marks : " + sum);
        }
    }
}

// package Libraries_2.Problem36;

// import java.io.BufferedReader;
// import java.io.FileReader;

// public class Main {
// public static void main(String[] args) {
// String fileName = "Marks.txt";
// int sum = 0;

// try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
// String line;
// while ((line = br.readLine()) != null) {
// int endIndex = line.length() - 1;
// if (line.contains(",")) {
// endIndex = line.indexOf(',');
// }

// int num = Integer.parseInt(line.substring(0, line.length() - 1));
// sum += num;
// }
// } catch (Exception e) {
// System.out.println(e.getMessage());
// }

// finally {
// System.out.println(sum);
// }
// }
// }
