public class SortedArray {
  public static void main(String[] args) {
    int[] array = {3, 1, 53, 22, 54, 22, 65};
    System.out.println(sortedArray(array, 0));
    System.out.println(sortedArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 0));
  }

  static boolean sortedArray(int[] array, int f) {
    if(f == array.length-1) {
      return true;
    }

    if(array[f] < array[f+1]) {
      return sortedArray(array, f+1);
    }

    return false;
  }
}
