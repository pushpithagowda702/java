public class LeetCode443 {
  class Solution {
    public int compress(char[] chars) {
      String s = "";
      char[] temp = chars;
  
      if(temp.length == 1) {
        return 1;
      }
  
      for(int i=0; i<temp.length; i++) {
        int count=0;
        innerloop:
        for(int j=i; j<temp.length; j++) {
          
          if(temp[i] == temp[j]) {
              if(i>0 && temp[i] == temp[i-1]) {
                break innerloop;
            }
            count++;
          } else {
            break innerloop;
          }
        }
        if(count == 0) {
          continue;
        }
        if(count == 1) { 
          s += temp[i]; 
          continue;
        }
  
        s += temp[i] + Integer.toString(count);
      }
      for (int i=0; i<s.length(); i++) {
        chars[i] = s.charAt(i);
      }
      return s.length();
    }
  }
}
