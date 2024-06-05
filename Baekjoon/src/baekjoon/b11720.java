package baekjoon;

import java.util.Scanner;

public class b11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < cNum.length; i ++) {
			sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환하여 sum에 더해 누적
		}
		
		System.out.print(sum);

	}

}
