package baekjoon;

import java.util.Scanner;

public class swea2805 {
	public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int result = 0;

            // 배열 생성 및 입력 확인
            for (int i = 0; i < N; i++) {
                String line = sc.next(); // 공백 없이 연속된 숫자 라인을 입력받음
                for (int j = 0; j < N; j++) {
                    arr[i][j] = line.charAt(j) - '0'; // 각 문자를 숫자로 변환하여 배열에 저장
                }
            }

            // 마름모 형태 수확
            int center = N / 2;  // 농장의 중심
            
            for (int i = 0; i < N; i++) {
                int start = Math.abs(center - i);
                int end = N - start;
                for (int j = start; j < end; j++) {
                    result += arr[i][j];
                }
            }
		
			System.out.println("#"+ test_case + " " + result);
        }
    }
}
