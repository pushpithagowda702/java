class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder str = new StringBuilder(s);
        
        int i=0, j=s.length()-1;
        
        while(i<j) {
            if(Character.toLowerCase(s.charAt(i)) != 'a' && Character.toLowerCase(s.charAt(i)) != 'e' && Character.toLowerCase(s.charAt(i)) != 'e' && Character.toLowerCase(s.charAt(i)) != 'i' && Character.toLowerCase(s.charAt(i)) != 'o' && Character.toLowerCase(s.charAt(i)) != 'u') {
                i++;
            } else if(Character.toLowerCase(s.charAt(j)) != 'a' && Character.toLowerCase(s.charAt(j)) != 'e' && Character.toLowerCase(s.charAt(j)) != 'e' && Character.toLowerCase(s.charAt(j)) != 'i' && Character.toLowerCase(s.charAt(j)) != 'o' && Character.toLowerCase(s.charAt(j)) != 'u') {
                j--;
            } else {
                char a = s.charAt(i);
                char b = s.charAt(j);
                str.setCharAt(i, b);
                str.setCharAt(j, a);
                i++;
                j--;
            }
        }
        return str.toString();
    }
}
