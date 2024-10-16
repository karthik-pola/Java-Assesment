package Libraries_2.Problem42;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.comparingInt(String::length));

        treeSet.add("apple");
        treeSet.add("Mang");
        treeSet.add("orange");

        treeSet.add("ban");

        System.out.println(treeSet);
    }

}
