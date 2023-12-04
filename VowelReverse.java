import java.util.Arrays;

public class VowelReverse {
  public static void main(String[] args) {
    String s = "vowelswap";
    System.out.println(swap(s));
  }

  static String swap(String s) {
    char[] c = s.toCharArray();
    int i=0;
    int j=s.length()-1;

    while(i < j) {
      while(c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u') {
        i++;
        if(i >= j) {
          break;
        }
      }

      while(c[j] != 'a' && c[j] != 'e' && c[j] != 'i' && c[j] != 'o' && c[j] != 'u') {
        j--;
      if(i >= j) {
        break;
      }     
     }

      char ch;
      ch = c[i];
      c[i] = c[j];
      c[j] = ch;
      i++;
      j--;
    }

    return Arrays.toString(c);
  }
}
