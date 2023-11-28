import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] array = {9,3,5,6,2,52,4};
    sort(array, 1, array.length-1, 0);
    System.out.println(Arrays.toString(array));
  }

  static void sort(int[] array, int i, int e, int max) {
    if(e == 0) {
      return;
    }

    if(i < e) {
      if(array[max] < array[i]) {
        max = i;
      }
      sort(array, i+1, e, max);
    } else {
      int temp = array[e];
      array[e] = array[max];
      array[max] = temp;

      sort(array, 1, e-1, 0);
    }
  }
}
