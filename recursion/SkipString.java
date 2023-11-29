public class SkipString {
  public static void main(String[] args) {
    String s = "apple banana greenapple pineapple guava custard apple";
    System.out.println(skip(s));
    System.out.println();
  }

  static String skip(String s) {
    if(s.isEmpty()) {
      return "";
    }

    if(s.substring(0,5).equals("apple")) {
      return skip(s.substring(1));
    } else {
      return s.substring(0,1) + " " + skip(s.substring(1));
    }
  }
}
