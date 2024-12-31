package basic.배열에서_문자열_대소문자_변환하기;

import java.util.Arrays;

public class Solution78 {
    public static void main(String[] args) {
        Solution78 solution = new Solution78();
        runTest(solution, new String[] { "AAA","BBB","CCC","DDD" });
        runTest(solution, new String[] { "aBc","AbC" });
    }

    private static void runTest(Solution78 solution, String[] strArr) {
        String[] result = solution.solution(strArr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(strArr), Arrays.toString(result));
    }

    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 1) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }

        return strArr;
    }
}