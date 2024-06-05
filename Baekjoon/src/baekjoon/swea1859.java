package baekjoon;

import java.util.Scanner;

class swea1859{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
			int money = 0;
			int n = sc.nextInt();
			int[] price = new int[n];
		
			for(int i = 0; i < n; i++){
				price[i] = sc. nextInt();
			}
			
			for(int k = 0; k < n; k++){
				int max = price[k];
				for(int j = k; j < n; j++) {
					if (price[j] > max) {
						max = price[j];
					}
				}
			money = max - price[k] + money;
			}
			
			System.out.println("#" + test_case + " " + money);
		}
	}
}
