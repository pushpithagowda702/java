import java.util.*;

class ReverseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int[] array = new int[size];

    for(int i=0; i<size; i++){
      System.out.print("Enter the elements: ");
      array[i] = sc.nextInt();
    }
    System.out.print("[");
    for(int i=0; i<size; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print("]");

    int m = 0;
    int n = size - 1;

    while(m < n) {
      int temp = array[m];
      array[m] = array[n];
      array[n] = temp;
      m++;
      n--;
    }

    System.out.print("[");
    for(int i=0; i<size; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print("]");
  }
}