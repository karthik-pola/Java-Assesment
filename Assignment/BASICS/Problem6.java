import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for(int i=num-1;i>0;i--){
            if(num%i ==0){
                System.out.println(i);
                break;
            }
        }

    }
    
}
