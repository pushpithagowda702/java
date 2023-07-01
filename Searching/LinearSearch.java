import java.util.*;

class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    for(int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the element to be found: ");
    int k = sc.nextInt();
    int result = search(k, arr);
    if(result == 0) {
      System.out.println("Element not in the array");
    } else {
      System.out.println("Element found at: " + result);
    }
    sc.close();
  }
  static int search(int val, int[] arr) {
    for (int i=0; i<arr.length; i++) {
        if(arr[i] == val) {
          return i;
        }
    }
    return 0;
  }
}