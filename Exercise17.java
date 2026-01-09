public class Exercise17 {
    public static void main(String[] args) {
        int[]digits={1,2,3,6};
        int count=0;
        for(int i=0;i<digits.length;i++)
        {
            for(int j=0;j<digits.length;j++)
            {
                for(int k=0;k<digits.length;k++)
                {
                    if ((digits[i] != digits[j])&&(digits[j]!=digits[k])&&(digits[i]!=digits[k])) {

                        int number=((digits[i]*100)+(digits[j]*10)+(digits[k]));

                        System.out.print(number + " ");
                        count++;
                    }
                }
            }
        }
        System.out.println("\nTotal unique numbers are:"+count);
    }
}
