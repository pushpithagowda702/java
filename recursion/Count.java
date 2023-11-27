public class Count {
  public static void main(String[] args) {
    System.out.println(countZero(302020, 0));
    System.out.println(countNine(3929990, 0));
  }

  static int countZero(int num, int count) {
    if(num==0) {
      return count;
    }

    if(num%10 == 0) {
      return countZero(num/10, count + 1);
    } else {
      return countZero(num/10, count);
    }
  }

  static int countNine(int num, int count) {
    if(num==0) {
      return count;
    }

    if(num%10 == 9) {
      return countNine(num/10, count + 1);
    } else {
      return countNine(num/10, count);
    }
  }
}
