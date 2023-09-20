public class LongestWord {
  public static void main(String[] args) {
    Solution sl = new Solution();
    String s = "Hello World";
    System.out.println(sl.lengthOfLastWord(s));
  }
}

class Solution {
    public int lengthOfLastWord(String s) {
       String str=s.trim();
        
        int count=0;
        int i=str.length()-1;
        
        while(i>=0 && str.charAt(i)!= ' '){
            count++;
            i--;
        }
        return count;
    }
}