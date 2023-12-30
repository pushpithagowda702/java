public class LeetCode1688 {
  class Solution {
    public int numberOfMatches(int n) {
        int num = n;
        int total = 0;
        
        while(num > 1) {
            if(num%2 == 0) {
                total += num/2;
                num = num/2;
            } else {
                total += (num-1)/2;
                num = ((num-1)/2)+1;
            }
        }
        return total;
    }
}
}
