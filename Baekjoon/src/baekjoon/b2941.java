package baekjoon;

import java.util.Scanner;

public class b2941 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alphabet : croatianAlphabets) {
            while (word.contains(alphabet)) {
                word = word.replaceFirst(alphabet, "*");
            }
        }

        System.out.println(word.length());
    }
}
