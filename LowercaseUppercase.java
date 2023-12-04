public class LowercaseUppercase {
  public static void main(String[] args) {
    System.out.println(lowerCase("NeverLetGoOfOppurtunities"));
    System.out.println(upperCase("NeverLetGoOfOppurtunities"));
  }

  static String lowerCase(String s) {
    String sol = "";

    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        sol += s.charAt(i);
      } else {
        sol += (char) (s.charAt(i) - 'A' + 'a');
      }
    }
    return sol;
  }

    static String upperCase(String s) {
    String sol = "";

    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        sol += s.charAt(i);
      } else {
        sol += (char) (s.charAt(i) - 'a' + 'A');
      }
    }
    return sol;
  }
}
