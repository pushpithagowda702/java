class BinarySearchRecursion {
  public static void main(String[] args) {
    int[] a = {10, 12, 12, 14, 21, 22, 23, 24, 54, 64, 64, 87, 89, 112, 134, 164, 212};
    if(binarySearch(a, 664, 0, a.length - 1)) {
      System.out.println("ELement present in the array");
    } else {
      System.out.println("Element not present in the array");
    }
  }

  public static boolean binarySearch(int[] a, int key, int low, int high) {
    if(low > high) {
      return false;
    } else {
    int mid = (low + high) / 2;
    if(a[mid] == key) {
      return true;
    } else if(a[mid] > key) {
      return binarySearch(a, key, low, mid-1);
    } else if(a[mid] < key) {
      return binarySearch(a, key, mid+1, high);
    }
  
  }
  return false;
}
}