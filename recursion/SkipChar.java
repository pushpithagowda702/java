public class SkipChar {
  public static void main(String[] args) {
    StringBuilder sol1 = new StringBuilder();
    skipCharacter(0, "amateur", sol1);
    System.out.println(sol1);
    StringBuilder sol2 = new StringBuilder();
    skipCharacter(0, "java", sol2);
    System.out.println(sol2);
  }

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
}
