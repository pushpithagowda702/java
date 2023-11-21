import java.util.Arrays;

class VariableLengthArgument {
  public static void main(String[] args) {
    fun(2, 3, 4, 5, 6, 7, 7);
    fun(3, 4);
  }

  static void fun(int ...v) {
    int sum = 0;

    for(int i=0; i<v.length; i++) {
      System.out.println(v[i]);
      sum += v[i];
    }
    System.out.println(sum);
  }

  static void fun(int a, int b) {
    System.out.println("a = " + a + "\nb = " + b);
  }
}