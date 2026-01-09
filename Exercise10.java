public class Exercise10 {
    public static void main(String[] args) {

        int[] arr = {100, 433, 21, 34, 433, 100, 45, 21};

        System.out.println("Unique elements are:");

        for (int i = 0; i < arr.length; i++) {

            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(arr[i]);
            }
        }
    }
}
