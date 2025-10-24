class Solution {
    public static String reverseWords(String s) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        Collections.reverse(words);
        return String.join(" ", words) ;
    }
}