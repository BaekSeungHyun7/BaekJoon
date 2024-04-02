package baekjoon;
import java.util.Scanner;
public class b18108 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int buddhaYear = sc.nextInt();
        if (buddhaYear < 1000 || buddhaYear > 3000) {System.exit(0);}
        
        int adYear = buddhaYear - 543;
        System.out.println(adYear);
		}
}
