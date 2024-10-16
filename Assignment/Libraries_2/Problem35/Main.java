package Libraries_2.Problem35;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("names.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() > 5) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
