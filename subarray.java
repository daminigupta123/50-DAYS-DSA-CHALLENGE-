public class subarray {
    
    public static void findSubarray(int[] arr, int target) {
        int start = 0, end = 0, currSum = 0;
        while (end < arr.length) {
            currSum += arr[end];

            // Shrink window from the left if sum exceeds target
            while (currSum > target && start < end) {
                currSum -= arr[start];
                start++;
            }

            // Check if current window matches the target sum
            if (currSum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
            end++;
        }
        System.out.println("No subarray with given sum found.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        findSubarray(arr, target); // Output: Subarray found from index 2 to 4
    }
}

