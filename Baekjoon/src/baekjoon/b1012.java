package baekjoon;

import java.util.Scanner;

public class b1012 {
	
	// 상하좌우로 이동하기 위한 방향 벡터
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    
    // 배추밭과 그 크기를 저장할 변수
    private static int[][] field;
    private static boolean[][] visited;
    private static int M, N;
    
	public static void main(String args[]) throws Exception{
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	
	for(int test_case = 1; test_case <= T; test_case++) {
		M = sc.nextInt(); //가로
		N = sc.nextInt(); //세로
		int K = sc.nextInt(); //배추의 갯수
		
		field = new int[N][M];
        visited = new boolean[N][M];
		
		// 배추 위치를 입력 받아 배추밭에 표시
		for (int i = 1; i <= K; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			field[y][x] = 1;
		}
		
		// 배추 군집의 수를 세기 위한 변수
        int wormCount = 0; //벌레 수
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 배추가 있고 방문하지 않은 위치를 발견하면 DFS 실행
                if (field[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    wormCount++;
                }
            }
        }
        
        // 현재 테스트 케이스에 대한 결과 출력
        System.out.println(wormCount);
	}
	
	}
	
	 private static void dfs(int x, int y) { //배추가 있을 때 그곳에서 참색하여 벌레를 놓는 방법
		 visited[y][x] = true;

	        // 네 방향(상하좌우)으로 탐색
	        for (int i = 0; i < 4; i++) {
	            int nx = x + dx[i];
	            int ny = y + dy[i];


	            if (nx >= 0 && ny >= 0 && nx < M && ny < N) { // 배추밭 경계 안에 있는 상태에서
	                if (field[ny][nx] == 1 && !visited[ny][nx]) { // 배추가 있으며 방문하지 않은 경우 탐색 계속
	                    dfs(ny, nx);
	                }
	            }
	        }
	}
}
