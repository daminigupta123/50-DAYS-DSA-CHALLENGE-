  
import java.util.*;

public class slidingwindows {

    // 1. Maximum sum of subarray of size k
    public static int maxSumSubarray(int[] arr, int k) {
        if (arr.length < k) return -1;

        int maxSum = 0;
        int windowSum = 0;

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    // 2. Minimum window substring (LeetCode 76)
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> dictT = new HashMap<>();
        for (char c : t.toCharArray()) {
            dictT.put(c, dictT.getOrDefault(c, 0) + 1);
        }

        int required = dictT.size();
        int l = 0, r = 0;
        int formed = 0;

        Map<Character, Integer> windowCounts = new HashMap<>();
        int[] ans = {-1, 0, 0}; // length, left, right

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                c = s.charAt(l);

                // Save the smallest window until now
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c) < dictT.get(c)) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    // 3. Longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // 4. Find all anagrams of pattern in string
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Build frequency count for pattern
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            sCount[s.charAt(right) - 'a']++;

            // Shrink window if it becomes larger than pattern
            if (right - left + 1 > p.length()) {
                sCount[s.charAt(left) - 'a']--;
                left++;
            }

            // Check if current window matches pattern
            if (right - left + 1 == p.length() && Arrays.equals(pCount, sCount)) {
                result.add(left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test Maximum sum of subarray of size k
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));

        // Test Minimum window substring
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum window substring for '" + t + "' in '" + s + "': " + minWindow(s, t));

        // Test Longest substring without repeating characters
        String str = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters in '" + str + "': " + lengthOfLongestSubstring(str));

        // Test Find all anagrams
        String text = "cbaebabacd";
        String pattern = "abc";
        System.out.println("Starting indices of anagrams of '" + pattern + "' in '" + text + "': " + findAnagrams(text, pattern));
    }
}