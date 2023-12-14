public class LeetCode2798 {
  class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        

        int count=0;
        
        for(int i : hours) {
            count += (i >= target) ? 1 : 0;
        }
        return count;
    }
}
}
