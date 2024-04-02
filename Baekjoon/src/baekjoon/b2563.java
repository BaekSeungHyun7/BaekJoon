package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2563 {
    public static void main(String[] args) throws IOException {
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine()); //색종이 수
    	int x = 100; //도화지 x 축
    	int y = 100; //도화지 y 축
    	int n = 0; //색종이 x 축
    	int m = 0; //색종이 y 축
    	int[][] arr = new int[x][y]; //도화지 전체 넓이
    	int result = 0; // 색종이 전체 넓이
    	
    	// 도화지 생성
    	for (int i = 0; i < x; i++) {
    		for (int j = 0; j < y; j++) {
    			arr[i][j] = 0;
    			}
    		}
    	
    	// 색종이 넓이를 구하는 식
        for (int i = 0; i < count; i++) { //색종이 수만큼 반복
        	StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            n = Integer.parseInt(stringTokenizer.nextToken());
            m = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = n; j < n + 10; j++) { //색종이 가로크기만큼 반복
                for (int k = m; k < m + 10; k++) { //색종이 세로크기만큼 반복
                    if (arr[j][k]== 0) { //색종이가 있는 부분 값이 0이면
                        arr[j][k] = 1; // 1로 변환
                        result++; // 결과값 카운트
                    }
                }
            }
        }
        
    	//결과 출력
        System.out.println(result);
    }
}
