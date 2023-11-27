package DynamicProgramming;

public class Fibonacci {
  public static void main(String[] args) {
    int n = 6;
    int[] array = new int[n+1];
    for(int i=0; i<n+1; i++) {
      array[i] = -1;
    }
    System.out.println(fib(n, array));
    System.out.println(fibBU(n, array));
    int a = 0;
    int b = 1;
    System.out.println(fib(n, a, b));
  }

  // Top-down approach

  static int fib(int n, int[] array) {
    if(n < 2) {
      array[n] = n;
      return array[n];
    }

    if(array[n] != -1) {
      return array[n];
    }

    array[n] = fib(n-1, array) + fib(n-2, array);
    return array[n];
  }

  // Bottom-Up approach

  static int fibBU(int n, int[] array) {
    
    for(int i=2; i<n; i++) {
      array[i] = array[i-1] + array[i-2];
    }

    return array[n];
  }

  // Optimum solution 

  static int fib(int num, int a, int b) {
    
    for(int i=2; i<=num; i++) {
      int c = a + b;
      a = b;
      b = c;
    }
    return b;
  }
  
}
