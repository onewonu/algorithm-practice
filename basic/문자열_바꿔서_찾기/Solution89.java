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
        StringBuilder builder = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                builder.append('B');
            } else if (c == 'B') {
                builder.append('A');
            }
        }

        boolean contains = builder.toString().contains(pat);
        return contains ? 1 : 0;
    }
}