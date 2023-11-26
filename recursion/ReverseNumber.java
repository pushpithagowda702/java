public class ReverseNumber {
  public static void main(String[] args) {
    System.out.println(reverse(154, 0));
  }

  static int reverse(int num, int rev) {
    if(num <= 0) {
      return rev;
    }

    rev = (rev * 10) + num % 10;

    return reverse(num/10, rev);
  }
}
