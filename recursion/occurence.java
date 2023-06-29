import java.util.*;

class occurence {
	public static int first = -1;
	public static int last = -1;

	public static void findIndex(String str, char ch, int ind) {
		if (ind == str.length()) {
			System.out.println("First occurence: "+first+" Last occurence: "+last);
			return;
		}
		if (str.charAt(ind) == ch) {
			if (first == -1) {
				first = ind;
			} else {
				last = ind;
			}
		}
		findIndex(str, ch, ind+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = sc.next().charAt(0);
		findIndex(str, ch, 0);
	}
}
