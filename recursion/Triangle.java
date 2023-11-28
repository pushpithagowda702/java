public class Triangle {
  public static void main(String[] args) {
    triangle(4);
  }

  static void triangle(int r) {
    triangle1(r, 0);
    triangle2(r, 0);
    System.out.println();
  }

  static void triangle1(int r, int c) {
    if(r == 0) {
      return;
    }
    if(c == r) {
      System.out.println();
      triangle1(r-1, 0);
    } else {
      System.out.print("*" + " ");
      triangle1(r, c+1);
    }
  }

  static void triangle2(int r, int c) {
    if(r == 0) {
      return;
    }
    if(c >= r) {
      triangle2(r-1, 0);
      System.out.println();
    } else {
      triangle2(r, c+1);
      System.out.print("*" + " ");
    }
  }
}
