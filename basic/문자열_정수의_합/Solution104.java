package basic.문자열_정수의_합;

public class Solution104 {
    public static void main(String[] args) {
        Solution104 solution = new Solution104();
        runTest(solution, "123456789");
        runTest(solution, "1000000");
    }

    private static void runTest(Solution104 solution, String num_str) {
        int result = solution.solution(num_str);
        System.out.printf("solution(%s) = %s%n", num_str, result);
    }

    public int solution(String num_str) {
        int answer = 0;
        int parseInt = Integer.parseInt(num_str);
        while (parseInt > 0) {
            answer += parseInt % 10;
            parseInt = parseInt / 10;
        }

        return answer;
    }
}