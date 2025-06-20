public class argrams {
       public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        // If lengths differ, not anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        // Compare sorted arrays
        return java.util.Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1, s2)); // Output: true
    }
}
