package baekjoon;

import java.util.Scanner;

public class swea1926 {
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
            String N = String.valueOf(test_case);
            int cnt = 0;

            for (char ch : N.toCharArray()) {
                if (ch == '3' || ch == '6' || ch == '9') {
                    cnt++;
                }
            }

            if (cnt > 0) {
                for (int j = 0; j < cnt; j++) {
                    System.out.print("-");
                }
            } else {
                System.out.print(test_case);
            }
            System.out.print(" ");
        }
	}
}
