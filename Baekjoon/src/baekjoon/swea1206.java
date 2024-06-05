package baekjoon;

import java.util.Scanner;

public class swea1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int building  = sc.nextInt();
			int[] height = new int[building];
			
			for(int i = 2 ; i < building - 2; i++) {
				height[i] = sc.nextInt();
			}
			
			int cnt = 0;
			// 맨 왼쪽 두 칸과 맨 오른쪽 두 칸은 항상 0이므로 검사하지 않음
            for (int i = 2; i < building - 2; i++) {
            	if (height[i] > height[i-2] && height[i] > height[i-1] && height[i] > height[i+1] && height[i] > height[i+2]){
                    int minDiff = Math.min(Math.min(height[i] - height[i-2], height[i] - height[i-1]), 
                                           Math.min(height[i] - height[i+1], height[i] - height[i+2]));
                    cnt += minDiff;
                }
            }
            
            System.out.println("#" + test_case + " " + cnt);
			
		}

	}

}
