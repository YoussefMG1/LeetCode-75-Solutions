public class Solution {
  public static String mergeAlternately(String word1, String word2) {
    // StringBuilder is better than String as String creates new object when it changes
    // 7ms , beats 12% -> 0ms , beats 100%
    StringBuilder result = new StringBuilder();
    int i=0;
    for(i=0; i< word1.length() && i < word2.length();i++){
      result.append(word1.charAt(i));
      result.append(word2.charAt(i));
    }
    if(i<word1.length())      result.append(word1.substring(i));
    else if(i<word2.length()) result.append(word2.substring(i));
    return result.toString();
  }
  public static String gcdOfStrings(String str1, String str2){
    if((str1 + str2).equals(str2 + str1)){
      int length = gcd(str1.length(),str2.length());
      System.out.println(length);
      return str1.substring(0,length);
    }
    return "";
  }
  public static int gcd (int n1,int n2){
    if(n2 <= 0 ) return n1;
    else return gcd(n2,n1%n2);
  }
  public static int gcdWhileLoop(int a, int b){
    while(b!=0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

}
