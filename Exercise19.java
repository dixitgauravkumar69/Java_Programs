import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 digits from which you want maximum and minimum as well;");
        int[]digits=new int[4];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++)
        {
            digits[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                    if ((digits[i] != digits[j])&&(digits[j]!=digits[k])&&(digits[i]!=digits[k])) {


                        int number = ((digits[i] * 100) + (digits[j] * 10) + (digits[k]));

                        if (number > max) {
                            max = number;
                        }
                        if (number < min) {
                            min = number;
                        }
                    }
                }
            }
        }

        System.out.println("MAx: "+ max);
        System.out.println("Min: "+min);
    }
}
