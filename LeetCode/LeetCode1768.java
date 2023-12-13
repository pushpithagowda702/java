public class LeetCode1768 {
  class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String merged = "";
        int minimum = Math.min(word1.length(), word2.length());
        
        for(int i=0; i<minimum; i++) {
            merged += word1.charAt(i);
            merged += word2.charAt(i);
        }
        
        if(word1.length() == word2.length()) {
            return merged;
        }
        
        if(word1.length() > word2.length()) {
            merged += word1.substring(word2.length());
        } else {
            merged += word2.substring(word1.length());
        } 
        
        return merged;
    }
}
}
