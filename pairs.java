public class pairs {
    

public class pairs {
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
        findPairs(arr, sum);
        // Output:
        // (1, 5)
        // (-1, 7)
        // (1, 5)
    }
}
}
