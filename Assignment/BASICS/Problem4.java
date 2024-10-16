// package Assignment;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week");
        int day = sc.nextInt();
        System.out.println("Enter the number of hours worked");
        int NumberOfHours = sc.nextInt();
        double temp=0;

        switch(day){

        case 1, 2, 3:
        
            temp = 200;
            break;
        case 4, 5:
            temp = 400;
            break;
        case 6:
            temp = 600;
            break;
        case 7:
            temp = 700;
            break;
        default:
            System.out.println("Enter a valid day");
        }


        temp = temp*NumberOfHours;

        if(temp>2000){
            temp = 1.1*temp;
        }
        System.out.printf("%.2f\n",temp);
    }
    
}
