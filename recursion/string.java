//Move all 'x' to end of the string

import java.util.*;

class string {
	public static void movx(String str, int i, int count, String newStr) {
		if (i == str.length()-1) {
			for (i=0; i<count; i++) {
				newStr += 'x';
			}
			System.out.println(newStr);
			return;

		}

		if (str.charAt(i) == 'x') {
			count++;
			movx(str, i+1, count, newStr);
		} else {
			newStr += str.charAt(i);
			movx(str, i+1, count, newStr);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newStr = "";
		movx(str, 0, 0, newStr);
	}
}
