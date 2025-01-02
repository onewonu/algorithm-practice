package basic.특정_문자열로_끝나는_가장_긴_부분_문자열_찾기;

public class Solution81 {
    public static void main(String[] args) {
        Solution81 solution = new Solution81();
        runTest(solution, "AbCdEFG", "dE");
        runTest(solution, "AAAAaaaa", "a");
    }

    private static void runTest(Solution81 solution, String my_string, String pat) {
        String result = solution.solution(my_string, pat);
        System.out.printf("solution(%s, %s) = %s%n", my_string, pat, result);
    }

    public String solution(String myString, String pat) {
        String answer = "";
        return answer;
    }
}