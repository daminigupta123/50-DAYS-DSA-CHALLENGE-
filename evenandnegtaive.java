 import java.util.Scanner;
 public class evenandnegtaive {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        // shift even and non-negative numbers to left
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0 && arr[i] >= 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        System.out.println("Array after shifting:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}