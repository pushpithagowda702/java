class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            res[i] = 0;
        }
        
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    res[i]++; 
                } else if(nums[i] < nums[j]) {
                    res[j]++;
                }
            }
        }
        return res;
    }
}

class LeetCode1365 {
  public static void main(String[] args) {
    Solution sl = new Solution();
    int[] l = {8,1,2,2,3};
    int[] sol = sl.smallerNumbersThanCurrent(l);
    for(int i=0; i<sol.length; i++) {
      System.out.println(sol[i]);
    }
  }
}