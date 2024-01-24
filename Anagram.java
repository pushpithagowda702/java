import java.util.*;

class Main2 {
  public static void main(String[] args) {
    int[] a = new int[26];

    String s2 = "bcadeh";
    String s1 = "hea";

    for(int i=0; i<a.length; i++) {
      a[i] = 0;
    }

    for(int i=0; i<s1.length(); i++) {
      int ind = (((int) s1.charAt(i)) - 97);
      a[ind]++;
    }

    for(int i=0; i<s2.length(); i++) {
      int ind = (((int) s2.charAt(i)) - 97);
      a[ind]--;
    }

    int count = 0;
    for(int i=0; i<a.length; i++) {
      count += a[i];
    }
    System.out.println(Math.abs(count));
  }
}
