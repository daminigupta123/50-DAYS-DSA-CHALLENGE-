public class count {
    
    public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4, 5};
        int x = 2;
        System.out.println("Occurrences of " + x + ": " + countOccurrences(arr, x)); // Output: 3
    }
}

