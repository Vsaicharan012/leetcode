class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int start = 0; // Start of the window
        int maxLength = 0; // Max length of the substring
        
        // Traverse the string with the 'end' pointer
        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the set, shrink the window from the left
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            // Add the current character to the set
            set.add(s.charAt(end));
            
            // Update the max length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}
