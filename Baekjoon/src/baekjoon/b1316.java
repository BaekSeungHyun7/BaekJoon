package baekjoon;
import java.util.Scanner;
public class b1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (isGroupWord(scanner.nextLine())) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        boolean[] check = new boolean[26]; // 알파벳이 이전에 등장했는지 여부를 저장하는 배열
        int prev = 0;

        for (int i = 0; i < word.length(); i++) {
            int current = word.charAt(i);

            if (check[current - 'a'] && prev != current) {
                return false;
            }

            check[current - 'a'] = true;
            prev = current;
        }
        return true;
    }
}
