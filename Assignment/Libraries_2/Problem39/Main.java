package Libraries_2.Problem39;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("names.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                set.add(line);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        finally {
            set.forEach(System.out::println);
        }

    }
}