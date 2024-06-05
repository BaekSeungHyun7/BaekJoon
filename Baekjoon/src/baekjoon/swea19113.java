package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class swea19113 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++){
			int N = sc.nextInt();
			int[] PI = new int [2 * N];
			int[] dis = new int[N];
			int disIndex = 0;
			
			for(int i = 0; i < 2 * N ; i++) {
				PI[i] = sc.nextInt();
				if(PI[i]%4 != 0 && PI[i]%3 ==0) {
					dis[disIndex] = PI[i];
					disIndex++;
				}
			}

			System.out.print("#" + test_case + " ");
			for(int i=0; i< disIndex; i++) {
				System.out.print(dis[i] + " ");	
			}
			
			System.out.println();
		}
	}
}
