import java.util.*;

class Fibonaaci{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter range: ");
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    for (int i=0; i<n; i++) {
     int c = a;
     a = b;
     b += c;
     System.out.println(c);
    }
    sc.close();
  }
}