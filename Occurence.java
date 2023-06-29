import java.util.*;

class Occurence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.print("Enter the digit: ");
    int dig = sc.nextInt();
    int count = 0;
    while (num != 0) {
      int lastdigit = num%10;
      num = num/10;
      if (lastdigit == dig) {
        count++;
      }
    }
    System.out.println(count + " Occurence");
    sc.close();
  }
}