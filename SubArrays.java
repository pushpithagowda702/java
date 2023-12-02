import java.util.*;

public class SubArrays {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};

    List<List<Integer>> subArray = new ArrayList<>();

    for(int i=0; i<arr.length; i++) {
      for(int j=i; j<arr.length; j++) {
        List<Integer> l = new ArrayList<>();
        for(int k=i; k<=j; k++) {
          l.add(k);
        }
        subArray.add(l);
      }
    }

    System.out.println(subArray);
  }
}
