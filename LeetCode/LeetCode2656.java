public class LeetCode2656 {
  class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        
        int num = 0;
        
        for(int i=0; i<k; i++) {
            num = num + nums[nums.length-1];
            nums[nums.length-1] = nums[nums.length-1] + 1;
            
            System.out.println(num );
        }
        return num;
    }
}
}
