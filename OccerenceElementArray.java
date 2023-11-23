class OccurenceElementArray {
  public static void main(String[] args) {
    
    int[] arr = {3, 2, 4, 1, 2, 3, 6, 4, 1};

    int ele = 0;
    
    for(int i=0; i<arr.length; i++) {
      ele = arr[i] ^ ele;
    }
    System.out.println("Element occuring only once is: " + ele);
  }
}