class PrintNumbers {
  public static void main(String[] args) {
    reverse(5);
    print(5);
  }

  static void reverse(int n) {
    if(n == 0) {
      return;
    }
    System.out.println(n);
    reverse(n-1);
  }

  static void print(int n) {
    if (n == 0) {
      return;
    }
    print(n-1);
    System.out.println(n);
  }
}