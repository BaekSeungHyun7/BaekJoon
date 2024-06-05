package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class swea1984 {
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++){
			int[] arr = new int[10]; //10크기의 배열
			int sum = 0;
			
			for(int i = 0;  i < 10; i++){				
				arr[i] = sc.nextInt(); //배열 0부터 9까지 입력
			}
			
			Arrays.sort(arr); //정렬
			
			for(int j = 0; j < 10; j++) {
				sum += arr[j]; //배열 인덱스 1부터 8까지 더하고 첫 식에서 배열 인덱스 0값까지 더해짐
			}
			
			double avg = (sum - arr[0] - arr[9]) / 8.0;
			int result = (int) Math.round(avg);
			
			System.out.println("#" + test_case + " " + result);
			
		}
	}
}
