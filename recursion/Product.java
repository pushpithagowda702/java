public class Product {
  public static void main(String[] args) {
    product(5, 1);
  }

  static void product(int num, int val) {
    if(val == 11) {
      return;
    }
    System.out.println(num + " * " + val + " = " +  (num * val));
    product(num, val+1);
  }
}
