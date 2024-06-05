package baekjoon;

import java.util.Scanner;

class swea20728{
    public static void main(String args[]) throws Exception{
         
        //System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int K = sc.nextInt();
             
            int[] candies = new int[N];           
            for (int i = 0; i <N; i++){
                candies[i] =sc.nextInt();
            }
             
            //오름차순 정렬
            for (int i = 0; i < N -1 ; i++){
                int minIndex = i;
                for (int j = i +1; j <N; j++){
                    if (candies[j] < candies[minIndex]){
                        minIndex = j;
                    }
                }
                int swap = candies[i];
                candies[i] = candies[minIndex];
                candies[minIndex] = swap;
            }
 
            int min = Integer.MAX_VALUE;
             
            //사탕 수 개산
            for (int i = 0; i <= N - K; i++){
                int dif = candies[i + K - 1] - candies[i];
                if (dif < min) {
                    min = dif;
                }
            }
             
            System.out.println("#" + test_case + " " + min);
        }
    }
}


