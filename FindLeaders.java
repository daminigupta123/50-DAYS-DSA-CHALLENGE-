import java.util.Scanner;
import java.util.ArrayList;

public class FindLeaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take array size input
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Take array elements input
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        // Find leaders
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);
        
        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        
        // Reverse to get left to right order
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            result.add(leaders.get(i));
        }
        
        System.out.println("\nLeaders in array: " + result);
        
        sc.close();
    }
}
