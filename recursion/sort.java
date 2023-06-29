import java.util.*;

class sort{
	public static boolean checkSort(int[] a, int ind) {
		if (ind == a.length-1) {
			return true;
		}
		if (a[ind] > a[ind+1] || a[ind] == a[ind+1]) {
			return false;
		} else {
			checkSort(a, ind+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.print("Enter array elements: ");
		for (int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(checkSort(a, 0));
	}
}
