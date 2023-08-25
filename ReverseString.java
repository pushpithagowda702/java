import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.next();
    StringBuilder rev = new StringBuilder();

    rev.append(str);
    rev.reverse();
    System.out.println("Reversed string: " + rev);
  }

}
