package baekjoon;
import java.util.Scanner;

public class swea1217 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int testCase = 1; testCase <= 10; testCase++) {
            int caseNumber = sc.nextInt();
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int result = power(N, M);
            System.out.println("#" + testCase + " " + result);
        }
        
    }
    
    public static int power(int N, int M) {
        if (M == 0) {
            return 1;
        } else if (M == 1) {
            return N;
        } else {
            return N * power(N, M-1);
        }
    }
}
