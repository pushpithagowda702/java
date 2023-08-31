import java.util.*;  
class SumNumbers {
    static int sum=0,rem;
    static int sumOfDigits(int num)
    {
            sum = sum + (num%10);
            rem = num/10;
            if(rem > 0)
            {
                sumOfDigits(rem);
            }
            return sum;
    }
    public static void main(String ...args){
        int result;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number- ");  
        int originalNum= sc.nextInt();  
        result = SumNumbers.sumOfDigits(originalNum);
        System.out.println("Sum = "+result);
    }
} 
