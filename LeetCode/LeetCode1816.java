class Solution {
  public String truncateSentence(String s, int k) {
      String str = "";
      
      String[] sol = s.split(" ");
      
      for(int i=0; i<k; i++) {
          str += sol[i] + " ";
      }
      
      return str.trim();
  }
}