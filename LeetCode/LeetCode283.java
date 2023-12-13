public class LeetCode283 {
  class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = -1;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nonZero++;
                nums[nonZero] = nums[i];
            }
        }
        
        for(int i=nonZero+1; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}
}
