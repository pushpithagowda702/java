import java.util.*;

class AreaCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius: ");
    int r = sc.nextInt();
    sc.close();
    System.out.println("Area of the circle is: " + 3.14 * r * r);
  }
}
