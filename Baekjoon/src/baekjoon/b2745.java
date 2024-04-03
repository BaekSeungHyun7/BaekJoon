package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b2745 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        // 10진법으로 변환된 결과를 저장할 변수
        int base10 = 0;
        
        // N을 10진법으로 변환
        for (int i = 0; i < N.length(); i++) {
            int value = Character.digit(N.charAt(i), 36);
            base10 = base10 * B + value;
            //base10 += value * Math.pow(B, N.length() - 1 - i);
        }

        // 결과 출력
        System.out.println(base10);
    }
}
