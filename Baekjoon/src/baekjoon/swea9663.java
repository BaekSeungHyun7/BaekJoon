package baekjoon;

import java.util.Scanner;

public class swea9663 {
	public static int[] arr;
	public static int cnt = 0;
	public static int N;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
            arr = new int[N];
            cnt = 0;
			
			nQueen(0);
			System.out.println(cnt);
		}
	}
	
	public static void nQueen(int a) {
		if (a == N) {
			cnt++;
			return;
		}
 
		for (int i = 0; i < N; i++) {
			arr[a] = i;
			if (Possibility(a)) {
				nQueen(a + 1);
			}
		}
 
	}
 
	public static boolean Possibility(int b) {
 
		for (int i = 0; i < b; i++) {
			if (arr[b] == arr[i]) {
				return false;
			} 
			
			else if (Math.abs(b - i) == Math.abs(arr[b] - arr[i])) {
				return false;
			}
		}
		
		return true;
	}
}
