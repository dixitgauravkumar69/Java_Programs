import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word :");
        String word=sc.nextLine();
        String result="";

        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLetter(c))
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    result=result+Character.toUpperCase(c);
                }
                else
                {
                    result=result+Character.toLowerCase(c);
                }
            }
            else
            {
                result=result+c;
            }
        }
        System.out.println(result);

    }
}
