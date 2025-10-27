class Solution {
    public static  int[] productExceptSelf(int[] nums) {
        int firstZero = -1;
        long result=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && firstZero != -1){
                //found second zero
                result = 0;
                break;
            }
            else if(nums[i] == 0 && firstZero == -1)
                firstZero = i;
            
            else result *= nums[i];
        }
        int[] answer = new int[nums.length];
        if(result == 0) return answer;
        else if(firstZero > -1) {
            answer[firstZero] = (int)result;
            return answer;
        }
        for (int i = 0; i < answer.length; i++) 
            answer[i] =(int) result/nums[i];
        return answer;
    }
}
