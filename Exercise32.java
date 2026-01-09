import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Start date (dd/MM/yyyy format): ");
        String start_Date = sc.nextLine();

        System.out.println("End date (dd/MM/yyyy format): ");
        String end_Date = sc.nextLine();

        System.out.println("Per Day charge: ");
        int P_P = sc.nextInt();

        System.out.println("Excluded Saturday count: ");
        int Ex_Saturday = sc.nextInt();

        System.out.println("Excluded Sunday count: ");
        int Ex_Sunday = sc.nextInt();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate sd = LocalDate.parse(start_Date, format);
        LocalDate ed = LocalDate.parse(end_Date, format);

        // Validation 1: Date order
        if (ed.isBefore(sd)) {
            System.out.println("End date cannot be before start date");
            return;
        }

        long totalDays = ChronoUnit.DAYS.between(sd, ed) + 1;
        System.out.println("Total days: " + totalDays);

        int excludedDays = Ex_Saturday + Ex_Sunday;

        // Validation 2: Excluded days logic
        if (excludedDays > totalDays) {
            System.out.println("Excluded days cannot be greater than total days");
            return;
        }

        int Paid_Days = (int) totalDays - excludedDays;
        int Total_Invoice = Paid_Days * P_P;

        System.out.println("Paid days: " + Paid_Days);
        System.out.println("Total invoice is: $" + Total_Invoice);
    }
}
