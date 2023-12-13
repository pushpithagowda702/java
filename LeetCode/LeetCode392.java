public class LeetCode392 {
  class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int st = 0;
        
        for(int i=0; i<s.length(); i++) {
            while(st < t.length()) {
                if(s.charAt(i) == t.charAt(st)) {
                    count++;
                    st++;
                    break;
                }
                st++;
            }
        }
        return count == s.length();
    }
}
}
