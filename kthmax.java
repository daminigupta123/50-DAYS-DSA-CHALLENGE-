
   import java.util.Arrays;

public class kthmax {
    public static int kthMin(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int kthMax(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1};
        int k = 2;
        System.out.println("2nd Minimum: " + kthMin(arr, k)); // Output: 3
        System.out.println("2nd Maximum: " + kthMax(arr, k)); // Output: 7
    }
} 

