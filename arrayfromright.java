 import java.util.Scanner;
 public class arrayfromright {

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

        // Move non-zero elements to front
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill remaining places with 0
        while(count < n) {
            arr[count] = 0;
            count++;
        }

        System.out.println("Array after moving zeros to right:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}