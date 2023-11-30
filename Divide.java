public class Divide {
  public static void main(String[] args) {
    System.out.println(countDigits(121));
  }
  static int countDigits(int num) {
    int count = 0;
    int no = num;
    while(no != 0) {
        int n = no%10;
        if((num%n == 0)) {
            count += 1;
        }
        no = no/10;
    }
    return count;
  }
}
