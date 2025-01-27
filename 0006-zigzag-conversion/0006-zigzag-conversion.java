class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s; // No zigzag needed
        }
        
        // Create an array of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        int curRow = 0; // Start at the first row
        int direction = 1; // 1 for down, -1 for up
        
        // Build the zigzag pattern row by row
        for (char c : s.toCharArray()) {
            rows[curRow].append(c);
            // Change direction when reaching the top or bottom row
            if (curRow == 0) {
                direction = 1;
            } else if (curRow == numRows - 1) {
                direction = -1;
            }
            curRow += direction;
        }
        
        // Combine all rows into a single string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        
        return result.toString();
    }
}
