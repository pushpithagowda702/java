import java.util.Scanner;

class CeilingFloorNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the element: ");
    int target = sc.nextInt();
    int[] arr = {2, 5, 6 ,7, 8, 9, 10, 23, 55, 77};
    ceilingFloor(arr, target);
    sc.close();
  }

  static void ceilingFloor(int[] arr, int target) {
    int start = 0;
    int end = arr.length-1;
    int ceil;
    int floor;
    
    if(target > arr[arr.length-1]) {
      System.out.println("No ceiling");
      return;
    } else if(target < arr[0]) {
      System.out.println("No floor");
      return;
    }

    while(end >= start) {
      int mid = start + (end-start)/2;
      if(arr[mid] < target) {
        start = mid+1;
      } else if(arr[mid] > target) {
        end = mid-1;
      } else if(arr[mid] == target) {
        ceil = floor = arr[mid];
      }
    }
    ceil = arr[start];
    floor = arr[end];
    System.out.println("Ceil: " + ceil + " Floor: " + floor);
  }
}