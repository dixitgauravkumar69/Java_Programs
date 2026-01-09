import java.util.Scanner;

public class Exercise2 {
    public static void main(String...args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for table-");
        int Table=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(Table+ "*"+i + "="+ Table*i);
        }
    }
}
