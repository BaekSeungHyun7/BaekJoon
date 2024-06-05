package baekjoon;
import java.util.Scanner;
public class swea1954 {
	
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
			int N = sc.nextInt();
			int[][] snail = new int[N][N];
            int value = 1;  // 채워 넣을 값
            int x = 0, y = 0;
            int dx = 0, dy = 1;
            
            while (value <= N * N) {
                snail[x][y] = value;
                value++;

                int nx = x + dx;
                int ny = y + dy;
                
                // 범위를 벗어나거나 이미 채워진 칸인 경우 방향 전환
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || snail[nx][ny] != 0) {
                    if (dx == 0 && dy == 1) { // 오른쪽 -> 아래
                        dx = 1;
                        dy = 0;
                    } else if (dx == 1 && dy == 0) { // 아래 -> 왼쪽
                        dx = 0;
                        dy = -1;
                    } else if (dx == 0 && dy == -1) { // 왼쪽 -> 위
                        dx = -1;
                        dy = 0;
                    } else if (dx == -1 && dy == 0) { // 위 -> 오른쪽
                        dx = 0;
                        dy = 1;
                    }
                    nx = x + dx;
                    ny = y + dy;
                }
                
                // 위치 업데이트
                x = nx;
                y = ny;
            }
            
            // 결과 출력
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }
		}
	}
}
