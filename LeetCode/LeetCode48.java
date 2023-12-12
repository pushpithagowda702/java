public class LeetCode48 {
  class Solution {
    public void rotate(int[][] array) {
        
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<i; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length/2; j++) {
                int a = array[i][j];
                array[i][j] = array[i][array[i].length - j - 1];
                array[i][array[i].length - j - 1] = a;
            }
        }
    }
}
}
