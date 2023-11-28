import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] array = {8,3,7,2,5};
    sort(array, 0, array.length-1);
    System.out.println(Arrays.toString(array));
  }

  static void sort(int[] array, int i, int e) {
    if(e == 0) {
      return;
    }

    if(i < e) {
      if(array[i] > array[i+1]) {
        int temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
      }
        sort(array, i+1, e);
    } else {
        sort(array, 0, e-1);
      }
    }

}

