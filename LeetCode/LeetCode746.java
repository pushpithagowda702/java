public class LeetCode746 {
  class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n];
        
        return Math.min(minCost(cost, 0, memo), minCost(cost, 1, memo));
    }
    
    public int minCost(int[] cost, int i, int[] memo) {
        if (i >= cost.length) {
            return 0;
        }
        
        if (memo[i] != 0) {
            return memo[i];
        }
        
        int sum1 = minCost(cost, i + 1, memo) + cost[i];
        int sum2 = minCost(cost, i + 2, memo) + cost[i];
        memo[i] = Math.min(sum1, sum2);
        
        return memo[i];
    }
}
}
