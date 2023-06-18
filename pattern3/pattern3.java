import java.util.*;

class pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=0; j<=n; j++) {
				if (i==1 || i==n || j==0 || j==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
