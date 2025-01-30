package basic.부분_문자열;

public class Solution111 {
    public static void main(String[] args) {
        Solution111 solution = new Solution111();
        runTest(solution, "abc", "aabcc");
        runTest(solution, "tbt", "tbbttb");
    }

    private static void runTest(Solution111 solution, String str1, String str2) {
        int result = solution.solution(str1, str2);
        System.out.printf("solution(%s, %s) = %d%n", str1, str2, result);
    }

    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}