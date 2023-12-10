public class LeetCode258 {
  class Solution {
    public int addDigits(int num) {
        
        if(num < 10) {
            return num;
        }
        
        int sumDig = sum(num);
        
        while(sumDig > 9) {
            sumDig = sum(sumDig);
        }
        return sumDig;
        
    }
    
    private int sum(int num) {
        int sum = 0;
        while(num != 0) {
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}
}
