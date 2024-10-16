package Libraries_2.Problem40;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        try (BufferedReader br1 = new BufferedReader(new FileReader("names1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("names2.txt"))) {
            String line;
            while ((line = br1.readLine()) != null) {
                set.add(line);
            }
            while ((line = br2.readLine()) != null) {
                set.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        finally {
            set.forEach(System.out::println);
        }
    }
}
