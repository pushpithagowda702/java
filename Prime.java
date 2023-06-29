import java.util.*;

class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if (isPrime(num)) {
      System.out.println("Number is not prime");
    } else {
      System.out.println("Number is prime");
    }

  }
  static boolean isPrime(int num) {
    boolean result = false;
    if (num%2 == 0) {
      result = true;
    } else {
      for (int i=3; i<=num/2; i++){
        if (num%i == 0) {
          result = true;
          break;
        } 
      }
    }
    return result;
  }
}