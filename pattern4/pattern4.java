import java.util.*;

class pattern4 {
	public static void main(String[] args) {
		System.out.print("Enter range: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
