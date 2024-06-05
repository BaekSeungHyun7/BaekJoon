package baekjoon;

import java.util.Scanner;

public class swea2072 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{//모든 테스트 케이스 당 반복

			int num[] = new int[10]; //숫자 10개
			int total = 0;
			for(int i=0; i < 10 ; i++) {
				num[i] = sc.nextInt(); //숫자 10번 입력
				if(num[i]%2 != 0) {
					total = total + num[i];
				}
			}
			System.out.println("#" + test_case + " " + total);
		}
	}
}
