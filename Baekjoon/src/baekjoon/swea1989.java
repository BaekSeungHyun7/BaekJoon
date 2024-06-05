package baekjoon;

import java.util.Scanner;

public class swea1989 {
	
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String word = sc.nextLine();
			
			if (P(word)) {
				System.out.println("#" + test_case + " " + 1);
			}else {
				System.out.println("#" + test_case + " " + 0);
			}
		}
	}
	
	public static boolean P(String word) {
		int left = 0; //왼
		int right = word.length() - 1; //오
		
		while (left < right) {
			if(word.charAt(left) != word.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		return true;
	}

}
