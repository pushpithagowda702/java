import java.util.*;

class AsciiValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the character: ");
    char ch = sc.next().charAt(0);
    int chr = ch;
    System.out.println("Ascii value of " + ch + " is " + chr);
    sc.close();
  }
}
