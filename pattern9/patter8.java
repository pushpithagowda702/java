import java.util.*;

class pattern8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n value: ");
    int n = sc.nextInt();
    for (int i=0; i<n; i++) {
      for (int j=0; j<n-i; j++) {
        System.out.print(" ");
      }
      int count = i;
      System.out.print(1 + " ");
      for (int j=0; j<i; j++) {
        System.out.print(count + " ");
        count += j+1;
      }
      System.out.print(1);
      System.out.println();
    }
    sc.close();
  }
}