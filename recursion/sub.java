import java.util.*;

class sub {
	public static void subsequence(String str, int i, String newStr) {
		if (i == str.length()) {
			System.out.println(newStr);
			return;
		}
		subsequence(str, i+1, newStr+str.charAt(i));
		subsequence(str, i+1, newStr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		subsequence(str, 0, "");
	}
}
