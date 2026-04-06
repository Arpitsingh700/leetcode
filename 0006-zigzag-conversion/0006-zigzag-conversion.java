class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows]; 
        for (int i = 0; i < numRows; i++) {
            rows [i] = new StringBuilder();
        }
        
        int i = 0;
        int direction = 1;

        for (char c : s.toCharArray()) {
            rows[i].append(c);

            if (i == 0) direction = 1;
            else if (i == numRows - 1) direction = -1;

            i += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}