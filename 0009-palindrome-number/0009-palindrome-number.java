class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // Convert to string, reverse, and check for equality
        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
