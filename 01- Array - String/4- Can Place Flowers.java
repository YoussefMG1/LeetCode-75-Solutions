class Solution {
  
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int emptyAdjacentSlots = 0;
    int maxSlots = 0;
    boolean firstSlotsEmpty = true;
    for (int i = 0; i < flowerbed.length; i++) {
      if(flowerbed[i] == 0) emptyAdjacentSlots+=1;
      else {
        if(firstSlotsEmpty){
          firstSlotsEmpty = false;
          maxSlots += (emptyAdjacentSlots) /2;
        }
        else maxSlots += (emptyAdjacentSlots-1) / 2;
        emptyAdjacentSlots = 0;
      }
    }
    if(firstSlotsEmpty)   maxSlots += (emptyAdjacentSlots+1) /2;
    else maxSlots += emptyAdjacentSlots/2;
    return maxSlots >= n ;
  }
}
