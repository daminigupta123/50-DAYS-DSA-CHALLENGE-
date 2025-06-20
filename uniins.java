    import java.util.*;
public class uniins {
    
    public static void findUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) union.add(num);
        for (int num : arr2) union.add(num);
        System.out.println("Union: " + union);
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) intersection.add(num);
        }
        System.out.println("Intersection: " + intersection);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        findUnion(arr1, arr2);         // Output: Union: [1, 2, 3, 4, 5, 6, 7]
        findIntersection(arr1, arr2);  // Output: Intersection: [2, 5]
    }
}


