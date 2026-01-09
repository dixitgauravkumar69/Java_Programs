public class Exercise9 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 2, 4, 3, 5, 6, 4, 2, 5};

        System.out.println("Duplicate elements (printed only once):");

        for (int i = 0; i < arr.length; i++) {

            boolean printed = false;

            // check left side
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed)
                continue;

            // check right side
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
