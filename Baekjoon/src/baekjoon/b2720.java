package baekjoon;

import java.util.Scanner;

public class b2720 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int C = scanner.nextInt(); // 각 테스트 케이스 거스름돈
            int quarters = C / 25; // 쿼터 개수 계산
            C %= 25; // 쿼터를 제외한 남은 센트
            int dimes = C / 10; // 다임 개수 계산
            C %= 10; // 다임을 제외한 남은 센트
            int nickels = C / 5; // 니켈 개수 계산
            C %= 5; // 니켈을 제외한 남은 센트
            int pennies = C; // 남은 센트

            // 결과 출력
            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
        
        scanner.close();
    }
}
