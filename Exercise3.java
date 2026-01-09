import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many Fibonacci numbers you want:");
        int last = sc.nextInt();

        int f = 0;
        int s = 1;

        if (last >= 1)
            System.out.print(f);

        if (last >= 2)
            System.out.print(", " + s);

        for (int i = 3; i <= last; i++) {
            int t = f + s;
            System.out.print(", " + t);
            f = s;
            s = t;
        }
    }
}
