import java.util.*;

public class Pascal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    Solution sl = new Solution();
    List<List<Integer>> l = sl.getRows(rows);
    for(int i=0; i<l.size(); i++) {

      for(int j=l.size(); j>i; j--) {
        System.out.print(" ");
      }

      for(int j=0; j<l.get(i).size(); j++) {
        System.out.print(l.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}

class Solution{
  public List<List<Integer>> getRows(int rows) {
    List<List<Integer>> l = new ArrayList<>();
    int i=0;

    while(i != rows) {
      int j=0;
      List<Integer> temp = new ArrayList<>();
      while(j<i+1) {
        if(j==0 || j==i) {
          temp.add(1);
          j++;
          continue;
        }
        temp.add(l.get(i-1).get(j-1) + l.get(i-1).get(j));
        j++;
      }
      l.add(temp);
      i++;
    }
    return l;    
  }
}