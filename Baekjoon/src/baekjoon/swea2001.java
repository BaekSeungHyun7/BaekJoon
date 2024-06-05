package baekjoon;

import java.util.Scanner;

public class swea2001 {
	
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			
			//배열생성
			for(int i = 0; i< N ; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			
			// 최대 파리 배열 계산
			int max = 0;
		
			for(int i = 0; i< N - M; i++) {
				for(int j = 0; j < N - M; j++) {
					int currentMax = 0;
					for(int x = 0; x < M ; x++) {
						for(int y = 0; y < M; y++) {
							currentMax += arr[i + x][j + y];
						}
					}
					if (currentMax > max) {
						max = currentMax;
					}
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}

}
