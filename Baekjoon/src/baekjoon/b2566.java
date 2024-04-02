package baekjoon;
import java.util.Scanner;
public class b2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int max = Integer.MIN_VALUE;
		int maxArr_X = 0;
		int maxArr_Y = 0;
		
		for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = sc.nextInt();
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        maxArr_X = i;
                        maxArr_Y = j;
                    }
                }
        }
		
		//결과 출력
		System.out.println(max + "\n" + (maxArr_X + 1) + " " + (maxArr_Y + 1));
	}

}
