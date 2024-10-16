package Libraries_1;

import java.util.Random;

public class Problem19 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
            sum += arr[i];
        }

        double average = sum / (double) arr.length;
        System.out.println("Array elements greater than the average " + average + " are :");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.println(arr[i]);
            }
        }
}
}
