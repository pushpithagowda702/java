public class LinearSearch {
  public static void main(String[] args) {
    System.out.println(linearSearch(new int[]{1,2,42,52,5,4,2,45,32}, 0, 45));
    System.out.println(linearSearch(new int[]{1,2,42,52,5,4,2,45,32}, 0, 95));
  }

  static boolean linearSearch(int[] array, int i, int key) {
    if(i == array.length) {
      return false;
    }

    if(array[i] == key) {
      return true;
    }

    return linearSearch(array, i+1, key);
  }
}
