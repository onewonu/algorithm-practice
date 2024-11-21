package basic.문자열의_앞의_n글자;

public class Solution46 {
    public static void main(String[] args) {
        Solution46 solution = new Solution46();
        runTest(solution, "ProgrammerS123", 11);
        runTest(solution, "He110W0r1d", 5);
    }

    private static void runTest(Solution46 solution, String my_string, int n) {
        String result = solution.solution(my_string, n);
        System.out.printf("solution(%s %d) = %s%n", my_string, n, result);
    }

    public String solution(String my_string, int n) {
        String answer = "";
        return answer;
    }
}