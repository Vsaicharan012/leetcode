class Solution {
    public int myAtoi(String s) {
        // Step 1: Remove leading whitespace
        s = s.trim();
        if (s.isEmpty()) {
            return 0; // If string is empty after trimming, return 0
        }

        // Step 2: Handle the sign
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Read digits and form the number
        long result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            index++;

            // Step 4: Handle overflow during conversion
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        // Step 5: Apply the sign and return the result
        return (int) (result * sign);
    }
}
