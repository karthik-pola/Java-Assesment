// package Assignment;
import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter 5 numbers");

        for(int i=0;i<5;i++){
            sum+=sc.nextInt();
        }

        System.out.println(sum/5);
    }
    
}