class Solution {
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder is better than String as String creates new object when it changes
        // 7ms , beats 12% -> 0ms , beats 100%
        StringBuilder result = new StringBuilder();
        int i;
        for(i=0; i< word1.length() && i < word2.length();i++){
          result.append(word1.charAt(i));
          result.append(word2.charAt(i));
        }
        if(i<word1.length())      result.append(word1.substring(i));
        else if(i<word2.length()) result.append(word2.substring(i));
        return result.toString();
    }
}
