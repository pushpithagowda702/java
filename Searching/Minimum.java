import java.util.*;

class Minimum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter array elements: ");
    for (int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    int min = minimum(arr);
    if (min == -1) {
      System.out.println("Array is empty");
    } else {
      System.out.println("Minimum: " + min);
    }
  }
  public static int minimum(int[] arr) {
    if(arr.length == 0){
      return -1;
    }
    int min = arr[0];
    for(int i=1; i<arr.length; i++){
      if(min > arr[i]){
        min = arr[i];
      }
    } 
    return min;
  }
}