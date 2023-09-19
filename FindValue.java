public class FindValue {
  public static void main(String[] args) {
    String[] array = {"X--", "X++", "--X", "X++", "X++", "++X"};
    Solution sl = new Solution();
    System.out.println(sl.findValue(array));

  }

}

class Solution {
  public int findValue(String[] array) {
    int X=0;
    for(int i=0; i<array.length; i++) {
      if(array[i].equals("X--") || array[i].equals("--X")) {
        X -= 1;
      } else {
        X += 1;
      }
    }
    return X;
  }
}