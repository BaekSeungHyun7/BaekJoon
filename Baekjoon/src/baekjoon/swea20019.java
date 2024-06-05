package baekjoon;

import java.io.FileInputStream;
import java.util.Scanner;

public class swea20019 {
	public static void main(String args[]) throws Exception{	
		System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine(); //nextint 후 남은 개행문자 소비

		for(int test_case = 1; test_case <= T; test_case++){
			String word = sc.nextLine();
			System.out.println("#" + test_case + " "
			+ (isPalindromeOfPalindrome(word) ? "YES" : "NO"));
		}
		
	}
	
	public static boolean isPalindromeOfPalindrome(String word) {
		
		if(!isPalindrome(word)) {
			return false;
		}

		int mid = (word.length() - 1) / 2;
        String firstHalf = word.substring(0, mid);
        String secondHalf = word.substring(word.length() - mid);
        
        return isPalindrome(firstHalf) && isPalindrome(secondHalf);
		
    }

	public static boolean isPalindrome(String word) {

		for(int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 -i)) {
				return false;
			}
		}

		return true;

    }
	
}
