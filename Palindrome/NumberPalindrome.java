import java.util.*;

class NumberPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
      if(num < 0 || (num != 0 && num%10 == 0)) {
        System.out.println("Not a palindrome");
        System.exit(0);
      }
    sc.close();
    int reversed = 0;
    int original = num;
    while (num%10 != 0) {
      reversed = (reversed * 10) + (num % 10);
      num /= 10;
    }
    System.out.println(num + " " + reversed);
    if (original == reversed) {
      System.out.println("Is a palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
  }
}