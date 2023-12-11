public class Solution {
  public int countDigits(int num) {
      int count =0;
      int no = num;
      while(no != 0) {
          int n = no%10;
          if((num%n == 0)) {
              count++;
          }
          no = no/10;
      }
      return count;
  }
} 
