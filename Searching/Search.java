import java.util.*;

class Search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row size: ");
    int row = sc.nextInt();
    System.out.print("Enter col size: ");
    int col = sc.nextInt();
    int[][] arr = new int[row][col];
    System.out.println("Enter array elements: ");
    for (int i=0; i<row; i++) {
      for (int j=0; j<col; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.print("Enter element to be searched: ");
    int val = sc.nextInt();
    int[] result = search(arr, val);
    if(result == null) {
      System.out.println("Element not present");
    } else {
      System.out.println("Element present at: "+ result[0] + ", " + result[1]);
    }
    sc.close();
  }
  static int[] search (int[][] arr, int val) {
    for(int i=0; i<arr.length; i++) {
      for (int j=0; j<arr[i].length; j++){
        if(arr[i][j] == val) {
          int[] pos = new int[2];
          pos[0] = i;
          pos[1] = j;
          return pos;
        }
      }
    }
    return null;
  }
}