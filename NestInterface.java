class A {
  public interface Nested {
    boolean isOdd(int n);
  }
}

class B implements A.Nested {
  public boolean isOdd(int n) {
    return !(n%2 == 0);
  }
}

class NestedInterface {
  public static void main(String[] args) {
    B obj = new B();
    System.out.println(obj.isOdd(5));
  }
}
