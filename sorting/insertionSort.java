class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {1, 4, 23, 78, 24, 98, 34, 12, 9, 32};
		insertionSort(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int v = arr[i];
			int j = i - 1;

			while (j>=0 && arr[j] > v) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = v;
		}
	}
}