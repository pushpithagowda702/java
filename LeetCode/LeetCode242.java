public class LeetCode242 {
  class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        int[] num = new int[26];
        
        for(int i=0; i<s.length(); i++) num[s.charAt(i) - 'a']++;
        for(int i=0; i<t.length(); i++) num[t.charAt(i) - 'a']--;
        for(int i : num) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
}
