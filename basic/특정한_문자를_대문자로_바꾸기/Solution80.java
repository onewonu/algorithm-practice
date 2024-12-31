package basic.특정한_문자를_대문자로_바꾸기;

public class Solution80 {
    public static void main(String[] args) {
        Solution80 solution = new Solution80();
        runTest(solution, "programmers", "p");
        runTest(solution, "lowercase", "x");
    }

    private static void runTest(Solution80 solution, String my_string, String alp) {
        String result = solution.solution(my_string, alp);
        System.out.printf("solution(%s, %s) = %s%n", my_string, alp, result);
    }

    public String solution(String my_string, String alp) {
        char target = alp.charAt(0);
        return my_string.replace(target, Character.toUpperCase(target));
    }
}