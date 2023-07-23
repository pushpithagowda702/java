import java.util.*;

class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = sc.nextInt();
    System.out.print("Enter b: ");
    int b = sc.nextInt();
    while(b != 0) {
      int r = a%b;
      a = b;
      b = r;
    }
    System.out.println(a);
    sc.close();
  }
}