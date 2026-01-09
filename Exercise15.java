import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Dob (dd/MM/yyyy) ");
        String DOB=sc.nextLine();
       DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob=LocalDate.parse(DOB,formatter);
        LocalDate today=LocalDate.now();
        Period age=Period.between(dob,today);


        System.out.println(age.getYears()+" Years "+" "+age.getMonths()+" Months "+ " "+ age.getDays()+ " Days ");

    }
}
