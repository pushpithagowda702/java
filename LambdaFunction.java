import java.util.ArrayList;
import java.util.function.Consumer;

class LambdaFunction {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();

    for(int i=0; i<10; i++) {
      a.add(i+1);
    }

    // Method 1

    a.forEach((item) -> {
      System.out.println("Value: " + item);
    });

    System.out.println("");
    // Method 2

    Consumer<Integer> c = (item) -> System.out.println("value: " + 2*item);

    a.forEach(c);

    Sum s = (m, n) -> m + n;

    LambdaFunction l = new LambdaFunction();
    System.out.println(l.add(8, 6, s));
  }

  private int add(int a, int b, Sum s) {
    return s.add(a, b);
  }
}

interface Sum {
  int add(int a, int b);
}