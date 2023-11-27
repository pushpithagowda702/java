public class Palindrome {
  public static void main(String[] args) {
    String s = "MALAYALAM";
    String s2 = "RACEECAR";
    String s3 = "RACEACAR";
    System.out.println(palindrome(s, 0, s.length()-1));
    System.out.println(palindrome(s2, 0, s2.length()-1));
    System.out.println(palindrome(s3, 0, s3.length()-1));
  }

  static boolean palindrome(String str, int s, int e) {
    if(s >= e) {
      return true;
    }
      if(str.charAt(s) != str.charAt(e)) {
        return false;
      }
      return palindrome(str, s+1, e-1);
  }
}
