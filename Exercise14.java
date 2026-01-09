import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days which you want to be convert");
        int total_Days=sc.nextInt();

        int Year=total_Days/365;
        int remaining_Days=total_Days%365;

        int Week=remaining_Days/7;
        int Days=remaining_Days%7;

        System.out.println(Year+"Year "+Week+" Week "+Days+" Days");

    }
}
