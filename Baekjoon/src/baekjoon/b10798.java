package baekjoon;
import java.util.Scanner;
public class b10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] words = new String[5]; // 단어
        StringBuilder result = new StringBuilder(); // 세로로 읽은 글자
        
        // 사용자로부터 5개의 단어 입력 받고 단어를 열로 구분 (nextLine)
        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
        }

        // 최대 단어 길이를 가진 열까지 반복함
        for (int col = 0; col < 15; col++) { //열
            for (int row = 0; row < 5; row++) { //행 (단어)
                if (col < words[row].length()) { // 현재 열에서 글자가 있는지 확인
                    result.append(words[row].charAt(col)); // 있으면 결과에 추가
                }
            }
        }

        // 결과 출력
        System.out.println(result.toString());

        sc.close();
	}
}
