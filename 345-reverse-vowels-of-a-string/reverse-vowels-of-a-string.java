class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder ans = new StringBuilder(s);

        while (i < j) {
            char b = ans.charAt(i);
            char c = ans.charAt(j);
            
            if (isVowel(b) && isVowel(c)) {
                ans.setCharAt(i, c);
                ans.setCharAt(j, b);
                i++;
                j--;
            } else if (!isVowel(b)) {
                i++;
            } else if (!isVowel(c)) {
                j--;
            }
        }
        
        return ans.toString();
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}