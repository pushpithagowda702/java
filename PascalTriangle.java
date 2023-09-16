import java.util.*;

class PascalTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++) {
      for(int j=n; j>i; j--) {
        System.out.print(" ");
      }
      int num = 1;
      for(int j=0; j<=i; j++) {
        System.out.print(num + " ");
        num = num * (i-j) / (j+1);
      }
      System.out.println();
    }
  }
}
