import java.util.*;

class Vowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char s = sc.next().charAt(0);
    sc.close();
    if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
      System.out.println(s + " is a vowel");
    }
    else {
      System.out.println(s + " is a consonant");
      }
  }
}