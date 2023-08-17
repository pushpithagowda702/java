import java.util.*;

class RectangleArea{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length: ");
    int len = sc.nextInt();
    System.out.print("Enter breadth: ");
    int bre = sc.nextInt();
    System.out.println("Area of rectangle is: " + len * bre);
  }
}