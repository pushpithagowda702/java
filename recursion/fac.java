import java.util.*;

class fac {
	public static void factorial(int n, int fac){
		if (n==1 || n==0) {
			System.out.println("Facotrial: " + fac);
			return;
		} else if (n < 0) {
			System.out.println("Invalid Input");
			return;
		}
		fac *= n;
		factorial(n-1, fac);
	}

	public static void main(String[] args){
		System.out.print("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorial(n, 1);
	}
}
