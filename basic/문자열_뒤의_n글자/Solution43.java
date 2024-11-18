package basic.문자열_뒤의_n글자;

public class Solution43 {
    public static void main(String[] args) {
        Solution43 solution = new Solution43();
        runTest(solution, "ProgrammerS123", 11);
        runTest(solution, "He110W0r1d", 5);
    }

    private static void runTest(Solution43 solution, String my_string, int n) {
        String result = solution.solution(my_string, n);
        System.out.printf("solution(%s %d) = %s%n", my_string, n, result);
    }

    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}