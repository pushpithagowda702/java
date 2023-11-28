class sort{
	public static boolean checkSort(int[] a, int ind) {
		if (ind == a.length-1) {
			return true;
		}
		if (a[ind] > a[ind+1] || a[ind] == a[ind+1]) {
			return false;
		} else {
			return checkSort(a, ind+1);
		}
	}

	public static void main(String[] args) {
		int[] array1 = {1,3,6,7,8,4,7,9};
		int[] array2 = {1,3,4,6,7,8,9};
		System.out.println(checkSort(array1, 0));
		System.out.println(checkSort(array2, 0));

	}
}
