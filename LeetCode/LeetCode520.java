public class LeetCode520 {
  class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == word.toUpperCase()){
            return true;
        }
        
        if(word == word.toLowerCase()){
            return true;
        }
        
        if(word.substring(0,1).equals(word.substring(0,1).toUpperCase()) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        
        return false;
  }
  }
}
