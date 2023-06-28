import java.util.*;

class Stringpal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		for(int i=0; i<str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				System.out.println("Not a palindrome");
				System.exit(0);
			}
		}
		System.out.println("Is a palindrome");
	}
}
