package Libraries_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String startDateInput = scanner.nextLine();
        String endDateInput = scanner.nextLine();

        LocalDate startDate = LocalDate.parse(startDateInput, formatter);
        LocalDate endDate = LocalDate.parse(endDateInput, formatter);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Number of days between: " + daysBetween);
        scanner.close();
    }
}
