package basic.두_수의_합;

public class Solution107 {
    public static void main(String[] args) {
        Solution107 solution = new Solution107();
        runTest(solution, "582", "734");
        runTest(solution, "18446744073709551615", "287346502836570928366");
        runTest(solution, "0", "0");
    }

    private static void runTest(Solution107 solution, String a, String b) {
        String result = solution.solution(a, b);
        System.out.printf("solution(%s, %s) = %s%n", a, b, result);
    }

    public String solution(String a, String b) {
        String answer = "";
        return answer;
    }
}