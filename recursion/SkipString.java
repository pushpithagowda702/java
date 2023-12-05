public class SkipString {
  public static void main(String[] args) {
    String s = "apple banana green apple pineapple guava custardappl";
    System.out.println(skip(s));
    System.out.println();
    System.out.println(skipString(s));
    System.out.println(skipAppNotApple(s));
  }

  static String skip(String s) {
    if(s.isEmpty()) {
      return "";
    }

    if(s.startsWith("apple")) {
      return skip(s.substring(1));
    } else {
      return s.substring(0,1) + "" + skip(s.substring(1));
    }
  }

  static String skipString(String s) {
    if(s.isEmpty()) {
      return "";
    }

    if(s.startsWith("apple")) {
      return skipString(s.substring(5));
    } else {
      return s.substring(0,1) + "" + skipString(s.substring(1));
    }
  }

  static String skipAppNotApple(String s) {
    if(s.isEmpty()) {
      return "";
    }

    if(!s.startsWith("apple") && s.startsWith("app")) {
      return skipAppNotApple(s.substring(3));
    } else {
      return s.substring(0,1)+""+skipAppNotApple(s.substring(1));
    }
  }
}
