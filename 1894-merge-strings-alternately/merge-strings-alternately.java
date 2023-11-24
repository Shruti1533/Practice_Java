class Solution {
    public String mergeAlternately(String word1, String word2) {
        String m = "";
        int i = 0;

        if (word1.length() <= word2.length()) {
            for (i = 0; i < word1.length(); i++) {
                char b = word1.charAt(i);
                char c = word2.charAt(i);
                m = m + b + c;
            }
            for (int j = i; j < word2.length(); j++) {
                char x = word2.charAt(j);
                m += x;
            }
        } else {
            for (i = 0; i < word2.length(); i++) {
                char b = word1.charAt(i);
                char c = word2.charAt(i);
                m = m + b + c;
            }
            for (int j = i; j < word1.length(); j++) {
                char x = word1.charAt(j);
                m += x;
            }
        }

        return m;
    }
}
