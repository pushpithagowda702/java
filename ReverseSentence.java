import java.util.*;

class ReverseSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the sentence: ");
    String sen[] = sc.nextLine().trim().split(" ");
    for(int i=sen.length-1; i>=0; i--) {
      System.out.print(sen[i] + " ");
    }
    System.out.println();
  }
}