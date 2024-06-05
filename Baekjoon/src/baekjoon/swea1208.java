package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class swea1208{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=10;
		
		for(int test_case = 1; test_case <= T; test_case++){
			int D = sc.nextInt();
			int[] arr = new int[100];
			
			for(int i = 0; i < 100; i++){
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < D; i++)
			{
				Arrays.sort(arr);
		        arr[0]++;
                arr[99]--;
			}
			
			Arrays.sort(arr);
            int result = arr[99] - arr[0];
			
			System.out.println("#" + test_case + " " + result);
		}
	}
}
