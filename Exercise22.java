import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].equals(words[j])) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(words[i]);
            }
        }
    }
}
