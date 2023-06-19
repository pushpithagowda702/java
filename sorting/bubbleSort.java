import java.util.*;

class bubbleSort {
	public static void main(String[] args){
		System.out.print("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter array elements:");
		for (int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-i-1; j++){
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
