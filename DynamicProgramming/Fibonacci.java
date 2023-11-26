package DynamicProgramming;

public class Fibonacci {
  public static void main(String[] args) {
    int n = 6;
    int[] array = new int[n+1];
    for(int i=0; i<n+1; i++) {
      array[i] = -1;
    }
    System.out.println(fib(n, array));
  }

  // Top-down approach
  
  static int fib(int n, int[] array) {
    if(n <= 1) {
      array[n] = n;
      return array[n];
    }

    if(array[n] != -1) {
      return array[n];
    }

    array[n] = fib(n-1, array) + fib(n-2, array);
    return array[n];
  }
  
}
