package basic.문자열_섞기;

public class Solution11 {
    public static void main(String[] args) {
        String solution = solution("aaaaa", "bbbbb");
        System.out.println("solution = " + solution);
    }

    public static String solution(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            stringBuilder.append(str1.charAt(i));
            stringBuilder.append(str2.charAt(i));
        }

        return stringBuilder.toString();
    }
}