import java.util.*;

class MatrixTranspose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row: ");
    int row = sc.nextInt();
    System.out.print("Enter col: ");
    int col = sc.nextInt();
    int[][] matrix = new int[row][col];

    for(int i=0; i<row; i++) {
      for(int j=0; j<col; j++) {
        System.out.print("Enter element: ");
        matrix[i][j] = sc.nextInt();
      }
    }

    System.out.println("Matrix: ");

    for(int i=0; i<row; i++) {
      for(int j=0; j<col; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    transpose(matrix, row, col);
  }

  public static void transpose(int[][] matrix, int row, int col) {
      
      int transpose[][] = new int[col][row];

      for(int i=0; i<col; i++) {
        for(int j=0; j<row; j++) {
          transpose[i][j] = matrix[j][i];
        }
      }

      System.out.println("Transpose: ");

      for(int i=0; i<col; i++) {
        for(int j=0; j<row; j++) {
          System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
      }
  }
}