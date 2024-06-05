package baekjoon;

import java.util.Scanner;

public class b11659 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int M = sc.nextInt(); //첫 숫자
		int arr[] = new int[N];
		int sArr[] = new int[N + 1];
		
		sArr[0] = 0; // 인덱스 초기화
		
		for (int i = 0; i < N; i++) { //배열 입력
			arr[i] = sc.nextInt();
			sArr[i+1] = sArr[i] + arr[i]; //누적 합 계산
		}
		
		for(int j = 0; j < M; j++) { //a to b 
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = sArr[b] - sArr[a-1];
			System.out.println(result);
		}
	}

}
