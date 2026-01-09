import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int []result=new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                result[index++]=arr[i];
            }

        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                result[index++]=arr[i];
            }
        }

        for(int n:result)
        {
            System.out.print(n+" ");
        }
    }
}
