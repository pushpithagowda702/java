public class SkipString {
  public static void main(String[] args) {
    String s = "applebananagreenapplepineappleguavacustardapple";
    System.out.println(skip(s));
    System.out.println();
    System.out.println(skipString(s));
  }

  static String skip(String s) {
    if(s.isEmpty()) {
      return "";
    }

    if(s.length() >= 5 && s.substring(0,5).equals("apple")) {
      return skip(s.substring(1));
    } else {
      return s.substring(0,1) + " " + skip(s.substring(1));
    }
  }

  static String skipString(String s) {
    if(s.isEmpty()) {
      return "";
    }

    if(s.length() >= 5 && s.substring(0,5).equals("apple")) {
      return skipString(s.substring(5));
    } else {
      return s.substring(0,1) + " " + skipString(s.substring(1));
    }
  }
}
