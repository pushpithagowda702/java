import java.util.ArrayList;
import java.util.List;

public class Index {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    findIndex(new int[]{2,4,5,2,5,24,2,52,1,3,2,52,3}, l, 0, 2);
    System.out.println(l);
  }

  static void findIndex(int[] a, List<Integer> l, int ind, int key) {
    if(ind == a.length) {
      return;
    }

    if(a[ind] == key) {
      l.add(ind);
    }
    
    findIndex(a, l, ind+1, key);
    return;
  }
}
