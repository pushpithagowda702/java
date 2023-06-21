import java.util.*;

class rev {
	public static void reverseString(String str, int ind) {
		if (ind==0) {
			System.out.println(str.charAt(ind));
			return;
		}
		System.out.print(str.charAt(ind));
		reverseString(str, ind-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		reverseString(str, str.length()-1);
	}
}
