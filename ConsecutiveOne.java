class Main {
  public static void main(String[] args) {
    int[] a = {1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0};

    int max = 0;
    int count = 0;

    for(int i=0; i<a.length; i++) {
      if(a[i] == 1) {
        count++;
      } else {
        if(max < count) {
          max = count;
        }
        count = 0;
      }

      if(i == a.length - 1 && max < count) {
        max = count;
      }

    }
    System.out.println(max);
  }
}