class MaxElementArray {
  public static void main(String[] args) {
    int[] a = {4, 2, 64, 23, 75, 21, 664, 67, 23, 676};

    System.out.println("Maximum element: " + max(a));
    System.out.println("Maximum element in a range: " + maxRange(a, 3, 6));
  }

  static int max(int[] a) {
    if(a.length == 0) {
      return -1;
    }
    int m = a[0];
    for(int i=1; i<a.length; i++) {
      if(a[i] > m) {
        m = a[i];
      }
    }
    return m;
  }

  static int maxRange(int[] a, int s, int e) {
    if(s > e) {
      return -1;
    }

    if(a == null) {
      return -1;
    }

    int max = a[s];

    for(int i=s+1; i<=e; i++) {
      if(a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }
}