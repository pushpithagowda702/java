public class LeetCode2006 {
  class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(Math.abs((nums[i] - nums[j])) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
}