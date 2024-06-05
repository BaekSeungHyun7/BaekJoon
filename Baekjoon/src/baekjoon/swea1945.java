package baekjoon;

import java.util.Scanner;

public class swea1945 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			float N = sc.nextInt();
			int[] arr1 = {2,3,5,7,11};
			int[] arr2 = new int[5];
			
			for (int i = 0; i < 5; i++) {
				while (N % arr1[i] == 0) {
	                arr2[i]++;
	                N = N/arr1[i];
	            }
			}
			System.out.println("#"+test_case + " " + arr2[0] + " " + arr2[1] + " " + arr2[2] + " " + arr2[3] + " " + arr2[4]);
		}
	}
}