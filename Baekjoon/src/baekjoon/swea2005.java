package baekjoon;

import java.util.Scanner;

public class swea2005 {

	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[][] t = new int[N][N];
			
			//삼각형 배열 제조
			for(int i = 0; i<N; i++) { //행
				for(int j = 0; j<=i; j++) { //열
					if ( j == 0 || j == i ) {
						t[i][j] = 1;
					}else {
						t[i][j] = t[i-1][j-1] + t[i-1][j];
					}
				}
			}
			
			
			//출력
			System.out.println("#" + test_case);
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<=i; j++) {
					System.out.print(t[i][j]);
					if (j < i) {
			            System.out.print(" ");
			        }
				}
				System.out.println();
			}

		}
	}
}
