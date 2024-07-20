package baekjoon;

import java.util.Scanner;

public class b10430 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int r1 = (A+B)%C;
		int r2 = ((A%C) + (B%C))%C;
		int r3 = (A*B)%C;
		int r4 = ((A%C) * (B%C))%C;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

}
