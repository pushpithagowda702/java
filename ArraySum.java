import java.util.Scanner;

class ArraySum {
  public static void main(String[] args) {

    System.out.print("How many numbers: ");
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    int[] numbers = new int[num];
    int sum=0;
    
    for(int n=0;n<num;n++){
      System.out.print("Enter number: ");
      int x = Integer.parseInt(sc.nextLine());
      numbers[n] = x;
    }

    for(int i = 0; i < numbers.length; i++) {  
        sum = sum + numbers[i];  
      }  
    System.out.println("Sum of all the elements of the array: " + sum);  
    
  }
}