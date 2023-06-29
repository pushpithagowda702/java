import java.util.*;

class Swap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a & b: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("a: " +  a + " b: "+ b);
    swap(a, b);
  }
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a: " +  a + " b: "+ b);
  }
}