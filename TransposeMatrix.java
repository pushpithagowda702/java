import java.util.Arrays;

public class TransposeMatrix {
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
    for(int i=0; i<matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
    transpose(matrix);
    for(int i=0; i<matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
  }

  static void transpose(int[][] matrix) {
    for(int i=0; i<matrix.length; i++) {
      for(int j=0; j<matrix[i].length; j++) {
        if(i>j) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
        }
      }
    }
  }
}
