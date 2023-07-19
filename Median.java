import java.util.*;

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] merged = new int[nums1.length + nums2.length];
      int i=0;
      int j=0;
      int k=0;
      
      while(i < nums1.length && j < nums2.length) {
          if(nums1[i] < nums2[j]) {
              merged[k++] = nums1[i++];
          } else {
              merged[k++] = nums2[j++];
          }
      }
      
      while(i < nums1.length) {
          merged[k++] = nums1[i++];
      }
      
      while(j < nums2.length) {
          merged[k++] = nums2[j++];
      }
      
      if(merged.length % 2 == 0) {
          return (merged[(merged.length / 2) - 1] + merged[merged.length / 2]) / 2.0;
      }
      return merged[merged.length / 2];
  }
}

public class Median {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array1: ");
    int size_array1 = sc.nextInt();
    System.out.print("Enter size of array2: ");
    int size_array2 = sc.nextInt();
    int[] arr1 = new int[size_array1];
    int[] arr2 = new int[size_array2];
    System.out.println("Enter elements of array1: ");
    for(int i=0; i<size_array1; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter elements of array2: ");
    for(int i=0; i<size_array2; i++) {
      arr2[i] = sc.nextInt();
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    Solution sl = new Solution();
    System.out.println("Median of the arrays are: " + sl.findMedianSortedArrays(arr1, arr2));
    sc.close();
  }
}