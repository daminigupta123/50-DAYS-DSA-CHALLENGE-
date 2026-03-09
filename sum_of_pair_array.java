import java.util.*;

public class sum_of_pair_array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7;
        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair: " + complement + ", " + num);
            }
            set.add(num);
        }
    }
}
