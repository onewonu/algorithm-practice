package basic.문자열_겹쳐쓰기;

public class Solution10 {
    public static void main(String[] args) {
        String solution = solution("He11oWor1d", "lloWorl", 2);
        System.out.println("solution = " + solution);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String frontPart = my_string.substring(0, s);
        String backPart = my_string.substring(s + overwrite_string.length());

        answer = frontPart + overwrite_string + backPart;
        return answer;
    }
}