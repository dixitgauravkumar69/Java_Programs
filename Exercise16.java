import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Date Format:");
        System.out.println("1. yyyy-MM-dd");
        System.out.println("2. MM/dd/yyyy");
        System.out.println("3. dd/MM/yyyy");
        System.out.println("4. dd-MMM-yyyy");

        int choice=sc.nextInt();
        String pattern=" ";
        switch(choice)
        {
            case 1:pattern="yyyy-MM-dd";
            break;
            case 2: pattern="MM/dd/yyyy";
            break;
            case 3:
                pattern="dd/MM/yyyy";
                break;
            case 4:
                pattern="dd-MM-yyyy";
                break;
            default:
                System.out.println("Choose correct option-");

        }

        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(pattern);

        System.out.println(now.format(formatter));

    }
}
