import java.util.*;

class StringLinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your string: ");
    String str = sc.nextLine();
    System.out.print("Enter the character to be searched: ");
    char ch = sc.next().charAt(0);
    boolean result = search(str, ch);
    if(result) {
     System.out.println("Character present in the string");
    } else {
      System.out.println("Character not found");
    }
  }
  public static boolean search(String str, char ch){
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i) == ch) {
        return true;
      }
    }
    return false;
  }
}