public class LeetCode268 {
  class Solution {
    public int missingNumber(int[] nums) {
        int[] res = new int[nums.length+1];
        
        for(int i=0; i<nums.length; i++) {
            res[nums[i]] = -1;
        }
        
        for(int i=0; i<res.length; i++) {
            if(res[i] != -1) {
                return i;
            }
        }
        return -1;
    }
}
}
