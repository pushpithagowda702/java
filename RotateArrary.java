import java.util.Arrays;

public class RotateArrary {
  public static void main(String[] args) {
    int[][] array = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
    rotate90(array);
    for(int i=0; i<array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
    }
  }

  static void rotate90(int[][] array) {
    transpose(array);
    for(int i=0; i<array.length; i++) {
      for(int j=0; j<array.length/2; j++) {
        int temp = array[i][j];
        array[i][j] = array[i][array.length-1-j];
        array[i][array.length-1-j] = temp;
      } 
    }
  }

  static void transpose(int[][] array) {
    for(int i=0; i<array.length; i++) {
      for(int j=0; j<i; j++) {
        int temp = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = temp;
      }
    }
  }
}
