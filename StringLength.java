class StringLength {
  public static void main(String[] args) {
    Solution s = new Solution();
    int l = s.lengthOfLastWord("Hello World");
    System.out.println(l);
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