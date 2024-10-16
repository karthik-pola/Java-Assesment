import java.util.*;
public class Problem9 {

    static int findMax(int a[]){

        int max = 0;

        for(int i:a){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        int a[] = new int [n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The largest number is " + findMax(a));

    }
    
}
