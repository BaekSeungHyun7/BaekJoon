package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b2750 {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();  // 수의 개수 N을 입력 받는다.
        int[] arr = new int[test_case]; // 배열의 크기를 N으로 초기화한다.
        
	
        for (int i = 0; i < test_case; i++) {
            arr[i] = sc.nextInt(); // 수를 입력 받아 배열에 저장한다.
        }
        
        Arrays.sort(arr); // 배열을 오름차순으로 정렬한다.
        
        for (int i = 0; i < test_case; i++) {
            System.out.println(arr[i]); // 정렬된 배열의 요소를 하나씩 출력한다.
        }
	}
}
