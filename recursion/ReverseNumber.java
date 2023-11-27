public class ReverseNumber {
  static int sum = 0;
  public static void main(String[] args) {
    
    reverse(154);
    System.out.println(sum);

    System.out.println(reverse(154, (int) Math.log10(154)));
  }
  // Method - 1
  static void reverse(int num) {
    if(num <= 0) {
      return;
    }

    sum = (sum * 10) + num % 10;
    reverse(num/10);

    return;
  }
  // Method - 2

  static int reverse(int n, int digits) {
    if(n%10 == n) {
      return n;
    }

    int sum = (n%10) * (int) Math.pow(10, digits);
    
    return sum+reverse(n/10, digits-1);
  }

}
