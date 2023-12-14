import java.util.Arrays;

public class LeetCode2733 {
  class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        if(nums.length > 2) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        } else {
            return -1;
        }
        
    }
}
}
