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
        for (char c : num_str.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }
}