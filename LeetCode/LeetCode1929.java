public class LeetCode1929 {
  class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = nums.length;
        int[] sol = new int[len*2];
       
        for(int i=0; i<len; i++) {
            sol[i] = nums[i];
            sol[i+len] = nums[i];
        }
        
        return sol;
        
    }
}
}
