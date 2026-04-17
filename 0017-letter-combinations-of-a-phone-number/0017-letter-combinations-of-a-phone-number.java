class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(result, map, digits, "", 0);
        return result;        
    }

    private void backtrack(List<String> result, String[] map, String digits, String curr, int index) {

        if (index == digits.length()) {
            result.add(curr);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            backtrack(result, map, digits, curr + c, index + 1);
        }
    }
}