import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0)
        {
            int l=num%10;
            sum+=l;
            num/=10;
        }
        System.out.println("Digit sum is: "+sum);
    }
}
