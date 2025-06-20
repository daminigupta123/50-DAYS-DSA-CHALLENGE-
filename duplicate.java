public class duplicate {
    
    
    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index - 1] < 0) {
                return index; // Duplicate found
            }
            arr[index - 1] = -arr[index - 1];
        }
        return -1; // No duplicate found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + findDuplicate(arr)); // Output: 2
    }
}

