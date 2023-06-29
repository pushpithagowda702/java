import java.util.*;

class remove {
	public static boolean[] map = new boolean[26];

	public static void remDuplicate(String str, int i, String newStr){
		if (i == str.length()) {
			System.out.println(newStr);
			return;
		}
		if (map[str.charAt(i)-'a'] == true) {
			remDuplicate(str, i+1, newStr);
		} else {
			newStr += str.charAt(i);
			map[str.charAt(i)-'a'] = true;
			remDuplicate(str, i+1, newStr);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		remDuplicate(str, 0, "");
	}
}
