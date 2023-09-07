import java.util.*;

public class JavaInterview {

    // 1. Reverse a string
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // 2. Check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }

    // 3. Find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // 4. Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 5. Find the common elements between two arrays
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> commonElements = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }

    public static void main(String[] args) {
        // Testing the functions
        String testString = "hello";
        System.out.println("Reverse of '" + testString + "': " + reverseString(testString));

        String palindromeString = "racecar";
        System.out.println("'" + palindromeString + "' is a palindrome: " + isPalindrome(palindromeString));

        int n = 10;
        System.out.println("Fibonacci(" + n + "): " + fibonacci(n));

        int primeNumber = 17;
        System.out.println(primeNumber + " is prime: " + isPrime(primeNumber));

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        List<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.println("Common elements between arr1 and arr2: " + commonElements);
    }
}
