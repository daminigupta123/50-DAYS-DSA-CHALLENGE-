import java.util.HashSet;

public class pairs {
    
    // Count pairs with given sum
    public static int countPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int num : arr) {
            int complement = sum - num;
            if (set.contains(complement)) {
                count++;
            }
            set.add(num);
        }
        return count;
    }
    
    // Find and print pairs with given sum
    public static void findPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = sum - num;
            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        
        // Count pairs
        int pairCount = countPairs(arr, sum);
        System.out.println("Number of pairs: " + pairCount);
        
        // Find and print pairs
        System.out.println("\nPairs found:");
        findPairs(arr, sum);
    }
}