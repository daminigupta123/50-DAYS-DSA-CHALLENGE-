public class missing {
    public static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2; // Sum of 1 to n
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // n = 6, missing 3
        int n = 6;
        System.out.println("Missing number: " + findMissing(arr, n)); // Output: 3
    }
}

