public class LeetCode151 {
  class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] str = s.trim().split("\\s+");
        StringBuilder st = new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            st.append(str[i] + " ");
        
        }
        
        return st.toString().trim();
    }
}
}
