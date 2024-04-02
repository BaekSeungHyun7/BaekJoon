package baekjoon;

import java.util.Scanner;

public class b10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int ans = 1;
		
		for (int i = str.length() - 1; i>=0; i--) {
			char palindrome = str.charAt(i);
			if (palindrome != str.charAt(str.length() - i - 1)) {
	            ans = 0;
	            break;
	        }
		}
		
		System.out.println(ans);
	}
}
