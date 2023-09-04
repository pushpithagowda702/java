import java.util.*;

public class ReverseStringWithoutBuiltin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String str = sc.next();
      char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
      for(int i= chars.length-1; i>=0; i--) {
          System.out.print(chars[i]);
      }
  }
}