import java.util.*;


class StringOccurence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    System.out.println("Enter the string: ");
    String str1 = sc.next();
    System.out.println("Enter the key: ");
    String key = sc.next();
    int ind = s.strStr(str1, key);
    System.out.println(ind);
  }
}

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length()-needle.length() + 1; i++) {
            String s = haystack.substring(i, i+needle.length());
            if(needle.equals(s)) {
                return i;
            }
        }
        return -1;
    }
}