import java.util.*;

class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int n = num;
    int sum = 0;
    sc.close();
    while (n > 0) {
     int lastdigit = n%10;
      n = n/10;
      sum += lastdigit * lastdigit * lastdigit; 
    }
    if (num == sum){
      System.out.println("Number is Armstrong");
    } else {
      System.out.println("Not an Armstrong number");
    }
  }
}