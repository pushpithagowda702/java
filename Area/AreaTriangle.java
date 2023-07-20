import java.util.*;

class AreaTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter base: ");
    int b = sc.nextInt();
    System.out.print("Enter height: ");
    int h = sc.nextInt();
    sc.close();
    System.out.println("Area of the triangle is: " + 0.5 * b * h);
  }
}
