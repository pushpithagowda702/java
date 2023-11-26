public class ProdDigits {
  public static void main(String[] args) {
    System.out.println(Product(117));
  }

  static int Product(int num) {
    if(num<=1) {
      return 1;
    }

    return Product(num/10) * (num%10);
  }
}
