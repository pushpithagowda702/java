import java.util.*;

class BinarySearch {
  public static void main(String[] args) {
    // Array sorted in ascending order
    int arr[] = {1,2,3,4,5,6,7,8,9,10,32};
    System.out.println("Enter the number to be searched: ");
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int ans = binarySearch(arr, target);
    if (ans == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at: " + ans + " position.");
    }
  }

  static int binarySearch(int arr[], int target) {
    int start = 0;
    int end = arr.length-1;

    while(start <= end) {
      int mid = start + (end - start) / 2;
      if(target < arr[mid]) {
        end = mid - 1;
      } else if(target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}