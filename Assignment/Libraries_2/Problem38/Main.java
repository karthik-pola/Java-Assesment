package Libraries_2.Problem38;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("Problem38.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line.toUpperCase()).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }

        try (FileWriter fs = new FileWriter("Problem38.txt", false)) {
            fs.write(sb.toString());
            fs.flush();
            System.out.println("done");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }
    }
}
