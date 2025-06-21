public class atoi {

    public static int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;

        int i = 0, sign = 1, result = 0;
        int n = str.length();

        // Skip leading whitespaces
        while (i < n && str.charAt(i) == ' ') i++;

        // Check for sign
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits to integer
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';

            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String str = "   -1234abc";
        System.out.println(myAtoi(str)); // Output: -1234
    }
}