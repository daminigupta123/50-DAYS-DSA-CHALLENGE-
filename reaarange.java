   import java.util.*;
 public class reaarange {
    public static void rearrange(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, p = 0, n = 0;
        // Alternate positive and negative numbers
        while (p < pos.size() && n < neg.size()) {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(n++);
        }

        // Add remaining positives
        while (p < pos.size()) arr[i++] = pos.get(p++);
        // Add remaining negatives
        while (n < neg.size()) arr[i++] = neg.get(n++);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Example output: 1 -4 2 -1 3 4
    }
}

