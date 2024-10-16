import java.util.ArrayList;
import java.util.Scanner;
public class Problem10 {

    static ArrayList<Integer> commonFact(int a[], int min, int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=min;i++){
            boolean temp = true;
            for(int j=0;j<n;j++){
                if(a[j]%i != 0){
                    temp = false;
                    break;
                }
            }
            if(temp){
                arr.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter the number of Elements");
        int n = sc.nextInt();
        int a[] = new int [n];
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(min>a[i]) min = a[i];
        }

        System.out.println("The common factors are : "+ commonFact(a, min, n));
    }
    
}
