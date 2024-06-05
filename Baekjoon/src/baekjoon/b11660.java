package baekjoon;

import java.util.Scanner;

public class b11660 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N+1][N+1];
		
		for (int i = 1 ; i <= N ; i++) {
			for (int j = 1 ; j <= N; j ++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[][] sArr = new int[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				sArr[i][j] = sArr[i][j-1] + sArr[i-1][j] - sArr[i-1][j-1] + arr[i][j];
		    }
		}
		
		for (int k = 0; k < M; k++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int result = sArr[x2][y2] - sArr[x1 -1][y2] -sArr[x2][y1 -1] + sArr[x1 -1][y1-1];
			System.out.println(result);
		}
	}
}
