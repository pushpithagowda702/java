import java.util.Arrays;

class SwapElementsArray {
  public static void main(String[] args) {
    int[] a = {1, 2, 5, 3, 8, 4, 73, 65};
    swap(a, 4, 5);
    System.out.println(Arrays.toString(a));
  }

  static void swap(int a[], int i, int b) {
    a[i] = a[i] + a[b];
    a[b] = a[i] - a[b];
    a[i] = a[i] - a[b];
  }
}