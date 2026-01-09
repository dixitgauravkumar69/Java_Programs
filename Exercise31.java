import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Command Line Calculator");
        int again =0;

        do {


            System.out.println("Choose operations-:");
            System.out.println("1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n"+
                    "5. Average\n"+
                    "6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter numbers for addition--");
                    int a, b;
                    a = sc.nextInt();
                    b = sc.nextInt();

                    System.out.println(a + b);
                    again=1;
                    break;
                case 2:
                    System.out.println("Enter numbers for subtraction--");
                    int c, d;
                    c = sc.nextInt();
                    d = sc.nextInt();
                    again=1;
                    System.out.println(c - d);
                    break;

                case 3:
                    System.out.println("Enter numbers for multiplication--");
                    int e, f;
                    e = sc.nextInt();
                    f = sc.nextInt();
                    again=1;
                    System.out.println(e * f);
                    break;

                case 4:
                    System.out.println("Enter numbers for devision--");
                    int g, h;
                    g = sc.nextInt();
                    h = sc.nextInt();
                    if (h == 0) {
                        System.out.println("Division by zero is not allowed");
                    } else {
                        System.out.println(g / h);
                    }

                    again=1;
                    break;

                case 5:
                    System.out.println("Enter numbers for calculating average");
                    int s1=sc.nextInt();
                    int s2=sc.nextInt();
                    int avg=(s1+s2)/2;
                    again=1;
                    System.out.println(avg);
                    break;

                case 6:

                    again=0;
                    break;

                default:
                    System.out.println("---Please check again you have entered wrong input----");


            }


        }while(again==1);

        System.out.println("Thanks-");
    }



}
