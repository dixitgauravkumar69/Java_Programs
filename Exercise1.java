import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range of numbers- \n" +
                "Starting number:");
        int Start=sc.nextInt();
        System.out.println("Last number-");
        int Last=sc.nextInt();

        System.out.println("1. ODD \n 2. EVEN");
        int Num_Type=sc.nextInt();

        if(Num_Type==1)
        {
            for(int i=Start;i<=Last;i++)
            {
                if(i%2!=0)
                {
                    System.out.print(i + " ");
                }


            }

        }

        else if(Num_Type==2)
        {
            for(int i=Start;i<=Last;i++)
            {
                if(i%2==0)
                {
                    System.out.print(i + " ");
                }


            }
        }

        else
        {
            System.out.println("please choose correct option--");
        }

    }
}
