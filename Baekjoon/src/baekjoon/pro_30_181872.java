//https://school.programmers.co.kr/learn/courses/30/lessons/181872

package baekjoon;

public class pro_30_181872 {
	public String solution(String myString, String pat) {
        String answer = "";
        
        int patL = pat.length();
        int myStringL = myString.length();
        
        for (int i = myStringL - 1; i >= 0; i--) {
            String subStr = myString.substring(0, i + 1);
            if (subStr.endsWith(pat)) {
                answer = subStr;
                break;
            }
        }

        return answer;
    }
}