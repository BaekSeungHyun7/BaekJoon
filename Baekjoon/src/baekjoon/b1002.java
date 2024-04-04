package baekjoon;

import java.util.Scanner;

public class b1002 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for(int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(findPositions(x1, y1, r1, x2, y2, r2));
        }
        sc.close();
    }
	
	public static int findPositions(int x1, int y1, int r1, int x2, int y2, int r2) {
		
        // 두 중심간의 거리의 제곱
        int distanceSquared = (int) Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2);
        
        // 두 원이 일치하는 경우
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // 두 원의 반지름 합의 제곱과 두 원의 중심 사이의 거리 비교
        if(distanceSquared > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if(distanceSquared < Math.pow(r2 - r1, 2)) {
            return 0; // 한 원이 다른 원 안에 있으며 내접하지 않음
        } else if(distanceSquared == Math.pow(r2 - r1, 2)) {
            return 1; // 내접
        } else if(distanceSquared == Math.pow(r1 + r2, 2)) {
            return 1; // 외접
        } else {
            return 2; // 두 점에서 만남
        }
    }

}
