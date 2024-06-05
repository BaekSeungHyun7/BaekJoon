package baekjoon;

import java.util.Scanner;

public class swea1209 {
	public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
         
        for(int test_case=1; test_case<=10; test_case++) {
            int T = sc.nextInt();  
            int[][] arr = new int[100][100];
            for(int i=0; i<100; i++) {
                for(int j=0; j<100; j++ ) {
                    arr[i][j] = sc.nextInt();
                }
            }
             
            int max = 0;
            int sum3=0; int sum4=0;
            for(int i=0; i<100; i++) {
                int sum1 = 0; int sum2 = 0; 
                for(int j=0; j<100; j++ ) {
                    sum1 += arr[i][j];
                    sum2 += arr[j][i];
                    if(i==j) sum3 += arr[i][j];
                    if((i+j)==99) sum4 += arr[i][j];
                }
                int temp = Math.max(sum1, sum2);
                max = Math.max(temp, max);
            }
            max = Math.max(max, sum3);
            max = Math.max(max, sum4);
             
            System.out.println("#" + T + " " + max);
        }
    }
}