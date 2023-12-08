import java.util.*;

class RemoveDuplicatesSortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int[] array = new int[size];

    for(int i=0; i<size; i++){
      System.out.print("Enter the elements: ");
      array[i] = sc.nextInt();
    }
    System.out.print("[");
    for(int i=0; i<size; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println("]");
    Solution sl = new Solution();
    System.out.println(sl.removeDuplicates(array));
    System.out.print("[");
    for(int i=0; i<size; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println("]");
  }
}

class Solution {
  public int removeDuplicates(int[] nums) {
      if (nums.length == 0) {
          return 0;
      }
      
      int m = 0; // Initialize k to 1 because the first element is always unique
      for (int i = 1; i < nums.length - 1; i++) {
        for(int j=0; j<nums.length; j++) {
          if (nums[i] == nums[j]) {
            for(int k=j; k<nums.length-1; k++) {
              nums[k] = nums[k+1];
            }
              m++;
          }
        }
      }
      
      return m;
  }
}

