class SortDescending {
  public static void main(String[] args) {
    int[] array = {9, 3, 45, 66, 22, 4, 98, 65, 72, 05, 74};
    for(int i=0; i<array.length; i++) {
      for(int j=0; j<array.length; j++) {
        if(array[j] > array[i]) {
          int temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
    for(int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}