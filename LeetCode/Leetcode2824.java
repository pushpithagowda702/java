import java.util.*;

class LeetCode2824 {
  public static void main(String[] args) {
    Solution sl = new Solution();
    List<Integer> l = new ArrayList<>();
    l.add(-1);
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(1);
    System.out.println(sl.countPairs(l, 2));
  }
}

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0; i<nums.size()-1; i++) {
            for(int j=i+1; j<nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
       return count; 
    }
}