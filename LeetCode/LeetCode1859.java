public class LeetCode1859 {
  class Solution {
    public String sortSentence(String s) {
        
        String[] res = s.split(" ");
        int rsize = res.length;
        String[] sol = new String[rsize];
        
        for(int i=0; i<rsize; i++) {
            int siz = res[i].length()-1;
            int num = res[i].charAt(siz) - '0';
            sol[num-1] = res[i].substring(0, siz);
        }
        
        String sr = "";
        
        for(int i=0; i<rsize; i++) {
            sr += sol[i] + " ";
        }
        return sr.trim();
    }
}
}
