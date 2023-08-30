class ArrayEquality {

  public static void main(String[] args) {
 
   int[] array1 = { 1, 2, 3, 4, 5 };
   int[] array2 = { 1, 2, 3, 4, 5 };
 
   boolean intCheck = equals(array1, array2);
   System.out.println("Two Integers are Equal :: " + intCheck);
  }
 
  public static boolean equals(int[] a1, int[] a2) {
   if (a1 == a2)
    return true;
   if (a1 == null || a2 == null)
    return false;
 
   int length = a1.length;
   if (a2.length != length)
    return false;
 
   for (int i = 0; i < length; i++)
    if (a1[i] != a2[i])
     return false;
 
   return true;
  }
 }