import java.util.Scanner;

class OrderAgnosticBinarySearch {
  public static void main(String[] args) {
    int[] arr1 = {1,3,7,9,21,64,76,87};
    int[] arr2 = {90,87,75,45,27,25,12,4};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the element to be searched: ");
    int target1 = sc.nextInt();
    int target2 = sc.nextInt();
    int ansAsc = oaBS(arr1, target1);
    int ansDes = oaBS(arr2, target2);
    System.out.println(ansAsc);
    System.out.println(ansDes);
  }

  static int oaBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {
      int mid = start + (end - start) / 2;
      boolean isAsc = arr[start] < arr[end];

      if(arr[mid] == target) {
        return mid;
      }

      if(isAsc) {
        if(target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if(target > arr[mid]){
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }

    }
    return -1;
}
}