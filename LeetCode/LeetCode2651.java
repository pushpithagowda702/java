public class LeetCode2651 {
  class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = arrivalTime + delayedTime;
        
        if(sum < 24) {
            return sum;
        } else {
            return sum%24;
        }
    }
}
}
