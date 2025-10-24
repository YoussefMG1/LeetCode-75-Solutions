import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  public static String reverseVowels(String s) {
    boolean[] isVowel = new boolean[128]; // bảng ASCII
    for (char c : "aeiouAEIOU".toCharArray()) {
      isVowel[c] = true;
    }
//    ArrayList<Character> vowels = new ArrayList<>(
//            Arrays.asList(new Character[] {'a','e','i','o','u','A','E','I','O','U'}));
    //instead of using : vowels.contains(s.charAt(i))
    //use : isVowel[s.charAt(i)]
    StringBuilder myString = new StringBuilder(s);
    int left = 0, right = myString.length()-1;
    while (left < right){
      if(isVowel[myString.charAt(left)] && isVowel[myString.charAt(right)]){
        // if the two are vowels swap them
        char temp = myString.charAt(left);
        myString.setCharAt(left,myString.charAt(right));
        myString.setCharAt(right,temp);
        right--;
        left++;
      }
      else if(isVowel[myString.charAt(left)]){
        right --;
      }
      else left++;
    }

    return myString.toString();
  }
    public static String bad_reverseVowels(String s) {
    ArrayList<Character> vowels = new ArrayList<>(Arrays.asList(new Character[] {'a','e','i','o','u','A','E','I','O','U'}));
    ArrayList<Character> vowelsInString = new ArrayList<>();
    StringBuilder myString = new StringBuilder(s);

    for (int i = 0; i < s.length(); i++) {
      if(vowels.contains(s.charAt(i))){
        vowelsInString.add(s.charAt(i));
      }
    }
    int len =vowelsInString.size();
    int j =1;
    for (int i = 0; i < s.length(); i++) {
      if(vowels.contains(myString.charAt(i))){
        myString.setCharAt(i, vowelsInString.get(len-j));
        j++;
      }
    }
    return myString.toString();
  }
}
