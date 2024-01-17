class Solution {
    public boolean halvesAreAlike(String s) {
        if(s=="") {
            return true;
        }
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2, s.length());
        return countVowels(s1) == countVowels(s2);
    }
                                
    private int countVowels(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
                count++;
            }
        }
        return count;
    }
}