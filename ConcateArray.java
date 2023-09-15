public class ConcateArray {
  public static void main(String[] args) {
    Solution sl = new Solution();
    int[] array = {1, 2, 3, 4, 5};
    int[] res = sl.getConcatenation(array);
    for(int i=0; i<res.length; i++) {
      System.out.print(res[i]);
    }
  }
}

class Solution {
  public int[] getConcatenation(int[] nums) {
      int n = nums.length;
      int[] ans = new int[2*n];
      for(int i=0; i<n; i++) {
          ans[i] = nums[i];
          ans[i+n] = nums[i];
      }  
      return ans;
  }
}