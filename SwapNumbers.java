import java.util.*;

class SwapNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int a = sc.nextInt();
    System.out.print("Enter number 2: ");
    int b = sc.nextInt();

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("a: " + a + "\nb: " + b);
    sc.close();
  }
}