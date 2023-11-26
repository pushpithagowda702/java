public class SumDigits {
  public static void main(String[] args) {
    
    System.out.println(sumDigits(153, 0));
  }

  static int sumDigits(int num, int ans) {
    if(num <= 0) {
      return ans;
    }
    
    return sumDigits(num/10, ans) + num%10;
  }
}
