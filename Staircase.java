import java.io.*;
import java.util.*;

class Result {

    public static void staircase(int n) {
    
      for(int i=0; i<n; i++) {
        for(int j=n-1; j>i; j--) {
          System.out.print(" ");
        }
        
        for(int j=0; j<=i; j++) {
          System.out.print("#");
        }
        System.out.println();
      }

    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
