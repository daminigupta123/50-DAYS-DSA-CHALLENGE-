    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Example 1: " + maxSubArray(nums1)); // Output: 6

        // Example 2
        int[] nums2 = {1};
        System.out.println("Example 2: " + maxSubArray(nums2)); // Output: 1

        // Example 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Example 3: " + maxSubArray(nums3)); // Output: 23

        // Additional test: all negative
        int[] nums4 = {-1, -2, -3};
        System.out.println("All negative: " + maxSubArray(nums4)); // Output: -1
    }
