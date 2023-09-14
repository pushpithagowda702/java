import java.util.*;

public class TwoSum {
  public static void main(String[] args) {
    Solution sl = new Solution();
    int[] nums = {2,7,11,15};
    int[] array = sl.twoSum(nums, 9);
    for(int i=0; i<array.length; i++) {
      System.out.print(array[i]+ " ");
    }
    System.out.println();
  }
}

class Solution {
  public int[] twoSum(int[] nums, int target) {
      int[] indices = {-1, -1};
      for(int i=0; i<nums.length; i++) {
          for (int j=i+1; j<nums.length; j++) {
              if(nums[i]+nums[j] == target) {
                  indices[0] = i;
                  indices[1] = j;
                  return indices;
              }
          }
      }
      return indices;
  }
}