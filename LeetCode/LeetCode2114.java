public class LeetCode2114 {
  class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        for(int i=0; i<sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            {
                if(max < s.length) {
                    max = s.length;
                }
            }
        }
        return max;
    }
}
}
