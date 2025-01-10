package basic.rny_string;

public class Solution90 {
    public static void main(String[] args) {
        Solution90 solution = new Solution90();
        runTest(solution, "masterpiece");
        runTest(solution, "programmers");
        runTest(solution, "jerry");
        runTest(solution, "burn");
    }

    private static void runTest(Solution90 solution, String rny_string) {
        String result = solution.solution(rny_string);
        System.out.printf("solution(%s) = %s%n", rny_string, result);
    }

    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}