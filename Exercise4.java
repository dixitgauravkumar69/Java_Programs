public class Exercise4 {
    public static void main(String[] args) {

        int[] arr = {12, 21, 23, 11, 20, 34, 32, 99, 23, 12, 45, 54};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i : arr) {

            // Max & Second Max
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }

            // Min & Second Min
            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i < secondMin && i != min) {
                secondMin = i;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
        System.out.println("Min: " + min);
        System.out.println("Second Min: " + secondMin);
    }
}
