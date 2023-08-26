import java.util.*;

class CheckVowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your string: ");
    String input = sc.next();
    for(int i=0; i<input.length(); i++) {
      if(input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U' || input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
        System.out.println("Vowel present");
        return;
      }
    }
    System.out.println("Vowel not present");
    return;
  }
}