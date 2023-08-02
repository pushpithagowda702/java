import java.util.*;

class MatrixAddition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of rows of matrix 1: ");
    int rows1 = sc.nextInt();
    System.out.print("Number of cols of matrix 1: ");
    int cols1 = sc.nextInt();
    System.out.print("Number of rows of matrix 2: ");
    int rows2 = sc.nextInt();
    System.out.print("Number of cols of matrix 2: ");
    int cols2 = sc.nextInt();
    if(rows1 != rows2 || cols1 != cols2) {
      System.out.println("Order of matrix should be same");
      sc.close();
      return;
    }
    int[][] matrix1 = new int[rows1][cols1];
    int[][] matrix2 = new int[rows2][cols2];
    insertValues(matrix1, rows1, cols1, sc);
    insertValues(matrix2, rows2, cols2, sc);
    int[][] sum = addMatrix(matrix1, matrix2, rows1, cols1);
    for(int i=0; i<rows1; i++) {
      for(int j=0; j<cols1; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    sc.close();
    }
  }

  public static void insertValues(int[][] matrix, int rows, int cols, Scanner sc) {
    for(int i=0; i<rows; i++) {
      for(int j=0; j<cols; j++) {
        System.out.print("Enter values for the matrix at position " + i + " " + j + ": ");
        matrix[i][j] = sc.nextInt();
      }
    }
  }

  public static int[][] addMatrix(int[][] matrix1, int[][] matrix2, int rows, int cols) {
    int[][] sum = new int[rows][cols];
    for(int i=0; i<rows; i++) {
      for(int j=0; j<cols; j++) {
        sum[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }
    return sum;
  }
}