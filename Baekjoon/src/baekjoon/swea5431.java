package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class swea5431 {
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
            // 수강생 수 N과 과제 제출자 수 K
            int N = sc.nextInt();
            int K = sc.nextInt();

            // 학생들의 과제 제출 여부
            boolean[] submitted = new boolean[N + 1];

            // 과제 제출자 번호를 기록
            for (int i = 0; i < K; i++) {
                int studentNumber = sc.nextInt();
                submitted[studentNumber] = true;
            }

            // 과제를 제출하지 않은 사람의 번호를 저장할 리스트
            List<Integer> notSubmitted = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                if (!submitted[i]) {
                    notSubmitted.add(i);
                }
            }

            // 결과 출력
            System.out.print("#" + test_case + " ");
            for (int i = 0; i < notSubmitted.size(); i++) {
                System.out.print(notSubmitted.get(i) + " ");
            }
            System.out.println();
        }
	}
}
