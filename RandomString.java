import java.util.Random;

public class RandomString {
  public static void main(String[] args) {
    StringBuilder b = new StringBuilder();
    Random random = new Random();
    
    for(int i=0; i<10; i++) {
      char c = (char) (97 + (int) (random.nextFloat() * 26));
      
      b.append(c);
    }
    System.out.println(b);
  }
}
