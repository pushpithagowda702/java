public class LeetCode2535 {
  class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 10) {
                eleSum += nums[i];
                digitSum += nums[i];
            } else {
                eleSum += nums[i];
                int n = nums[i];
                
                while(n != 0) {
                    digitSum += n%10;
                    n = n/10;
                }
            }
        }
        return eleSum - digitSum;
    }
}
}
