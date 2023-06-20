import java.util.*;

class pow {
	public static void power(int x, int n, int c) {
		if (n==1) {
			System.out.println(c * x);
			return;
		} else if (n==0) {
			System.out.println("1");
			return;
		}
		c = c * x;
		power(x, n-1, c);
	}

	public static void main(String[] args) {
		System.out.print("Enter x: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		power(x, n, 1);

}
}
