import java.util.Arrays;

class VariableLengthArgument {
  public static void main(String[] args) {
    fun(2, 3, 4, 5, 6, 7, 7);
    fun(3, 4);
  }

  static void fun(int ...v) {
    System.out.println(Arrays.toString(v));
  }

  static void fun(int a, int b) {
    System.out.println("a = " + a + "\nb = " + b);
  }
}