import java.util.*;

class hanoi {
	public static void towerHanoi(int n, String src, String help, String dest) {
		if (n == 1) {
			System.out.println("Transfer disk " +n+ " from " + src + " to " + dest);
			return;
		}
		towerHanoi(n-1, src, dest, help);
		System.out.println("Transfer disk " +n+ " from " + src + " to " + dest);
		towerHanoi(n-1, help, src, dest);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towerHanoi(n, "S", "H", "D");
	}
}
