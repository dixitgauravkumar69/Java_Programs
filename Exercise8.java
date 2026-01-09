import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("First Number: ");
        int a=sc.nextInt();

        System.out.print("Second Number: ");
        int b=sc.nextInt();

          a=a+b;
          b=a-b;
          a=a-b;

        System.out.println("After swaping------");
        System.out.println("First number: "+ a);
        System.out.println("Second number: "+b);

    }
}
