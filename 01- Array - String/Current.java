import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Current {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hi , how   are you ?  "));
    }
    public static String reverseWords(String s) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        Collections.reverse(words);
        return String.join(" ", words) ;
    }
}
