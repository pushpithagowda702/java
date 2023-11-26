public class SumDigits {
  public static void main(String[] args) {
    
    System.out.println(sumDigits(153));
  }

  static int sumDigits(int num) {
    if(num <= 0) {
      return 0;
    }
    
    return sumDigits(num/10) + num%10;
  }
}
