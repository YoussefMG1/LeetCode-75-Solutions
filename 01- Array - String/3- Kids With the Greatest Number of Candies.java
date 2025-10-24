import java.util.ArrayList;
import java.util.List;

class Solution {
  
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = candies[0];
    for (int i = 1; i < candies.length; i++)
      if(candies[i] > max) max = candies[i];

    ArrayList<Boolean> result = new ArrayList<>();
    for (int i = 0; i < candies.length; i++) {
      if(candies[i] + extraCandies >= max)
        result.add(true);
      else result.add(false);
    }
    return result;
  }

}
