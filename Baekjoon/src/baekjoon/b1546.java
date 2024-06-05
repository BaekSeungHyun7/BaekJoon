package baekjoon;

import java.util.Scanner;

public class b1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		long max = 0;
		long sum = 0;
		
		for( int i = 0; i < N; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			sum = sum + A[i];
		}
		
		double result = (double) sum * 100 / max / N;

        System.out.printf("%.3f\n", result); // 소수점 3째자리까지
	}
	
}
