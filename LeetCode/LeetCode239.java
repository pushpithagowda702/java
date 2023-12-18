public class LeetCode239 {
  class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
              return new int[0];
          }
  
          int n = nums.length;
          int[] result = new int[n - k + 1];
          int[] maxIndices = new int[n];
          int left = 0, right = 0;
  
          for (int i = 0; i < n; i++) {
              if (i - k >= maxIndices[left]) {
                  left++;
              }
              while (right > left && nums[i] >= nums[maxIndices[right - 1]]) {
                  right--;
              }
  
              maxIndices[right] = i;
              right++;
  
              if (i >= k - 1) {
                  result[i - k + 1] = nums[maxIndices[left]];
              }
          }
  
          return result;
      }
    }
}
