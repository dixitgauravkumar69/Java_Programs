public class Exercise11 {
    public static void main(String[] args) {
        int []arr={34,23,12,45,41,74,66};
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        int avg=sum/arr.length;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>avg)
            {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
