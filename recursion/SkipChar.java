public class SkipChar {
  public static void main(String[] args) {
    StringBuilder sol1 = new StringBuilder();
    skipCharacter(0, "amateur", sol1);
    System.out.println(sol1);
    StringBuilder sol2 = new StringBuilder();
    skipCharacter(0, "java", sol2);
    System.out.println(sol2);
    System.out.println(skipCharacter(0, "amateur"));
    System.out.println(skipCharacter(0, "java"));
    skipCharacter("amateur", "");
    skipCharacter("java", "");
  }
  // Method 1
  static void skipCharacter(int i, String s, StringBuilder ans) {
    if (i == s.length()) {
      return;
    }

    if(s.charAt(i)=='a') {
      skipCharacter(i+1, s, ans);
    } else {
      ans.append(s.charAt(i));
      skipCharacter(i+1, s, ans);
    }
  }

  // Method 2

  static String skipCharacter(int i, String s) {
    if(i == s.length()) {
      return "";
    }

    if(s.charAt(i) == 'a') {
      return skipCharacter(i+1, s);
    } else {
      return s.charAt(i) + skipCharacter(i+1, s);
    }
  }

  // Method 3
  static void skipCharacter(String s, String sol) {
    if(s.isEmpty()) {
      System.out.println(sol);
      return;
    }

    if(s.charAt(0) == 'a') {
      skipCharacter(s.substring(1), sol);
    } else {
      char ch = s.charAt(0);
      skipCharacter(s.substring(1), sol+ch);
    }
  }
}
