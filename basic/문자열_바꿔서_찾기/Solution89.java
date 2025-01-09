package basic.문자열_바꿔서_찾기;

public class Solution89 {
    public static void main(String[] args) {
        Solution89 solution = new Solution89();
        runTest(solution, "ABBAA", "AABB");
        runTest(solution, "ABAB", "ABAB");
    }

    private static void runTest(Solution89 solution, String myString, String pat) {
        int result = solution.solution(myString, pat);
        System.out.printf("solution(%s, %s) = %d%n", myString, pat, result);
    }

    public int solution(String myString, String pat) {
        int answer = 0;
        return answer;
    }
}