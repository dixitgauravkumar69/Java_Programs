import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter single digit number: ");
        int digit = sc.nextInt();

        int sum = 0;
        int term = 0;

        for (int i = 1; i <= 3; i++) {
            term = term * 10 + digit;
            sum = sum + term;
        }

        System.out.println("Sum = " + sum);
    }
}
