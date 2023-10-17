class MergeSort {
  public static void main(String[] args) {
    int[] A = {45, 20, 9, 11, 43}; 
    mergesort(A);

    for(int i=0; i<A.length; i++) {
      System.out.print(A[i] + ", ");
    }
  }

  public static void mergesort(int[] A) {
    int n = A.length;
    if(n > 1) {
      int mid = n/2;
      int[] B = new int[mid];
      int[] C = new int[n - mid];

      for(int i=0; i<mid; i++) {
        B[i] = A[i];
      }


      int a = 0;
      for(int i=mid; i<n; i++) {
        C[a] = A[i];
        a++;
      }

      mergesort(B);
      mergesort(C);
      merge(A, B, C);
    }
  }

  public static void merge(int[] A, int[] B, int[] C) {
    int p = B.length;
    int q = C.length;

    int i = 0, j = 0, k = 0;

    while(i < p && j < q) {
      if(B[i] < C[j]) {
        A[k] = B[i];
        i++;
      } else {
        A[k] = C[j];
        j++;
      }
      k++;
    }

    if(i == p) {
      for(int l=j; l<q; l++) {
        A[k] = C[l];
        k++;
      }
    }

    if(j == q) {
      for(int l=i; l<p; l++) {
        A[k] = B[l];
        k++;
      }
    }
  }
}