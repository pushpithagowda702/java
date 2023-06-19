import java.util.*;

class selectionSort {
	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<size-1; i++) {
			int smallest = i;
			int j;
			for (j=i+1; j<size; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
		for (int i=0; i<size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
