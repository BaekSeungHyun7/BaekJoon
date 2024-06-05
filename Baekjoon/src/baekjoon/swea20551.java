package baekjoon;

import java.util.Scanner;

class swea20551 {
	public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for(int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int minCandiesEaten = minCandiesToEat(A, B, C);
            System.out.println(minCandiesEaten);
        }

    }

    // 조건을 만족하는 최소 사탕 개수 계산
    public static int minCandiesToEat(int A, int B, int C) {
        if (A >= B && B >= C) {
            return -1;
        } else if (A == B && B == C) {
            return 1;
        } else if (A == B) {
            return minCandiesToEat(A + 1, B, C) + 1;
        } else if (B == C) {
            return minCandiesToEat(A, B + 1, C) + 1;
        } else {
            return minCandiesToEat(A, B, C - 1) + 1;
        }
    }
}
