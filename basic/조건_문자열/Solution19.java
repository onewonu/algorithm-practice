package basic.조건_문자열;

public class Solution19 {
    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        runTest(solution, "<","=", 20, 50);
        runTest(solution, ">","!", 41, 78);
    }

    private static void runTest(Solution19 solution, String ineq, String eq, int n, int m) {
        int result = solution.solution(ineq, eq, n, m);
        System.out.printf("solution(%d) = %d%n", n, result);
    }

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        // TODO: 간결한 조건으로 치환 가능성 있어보임.
        if (ineq.equals(">") && eq.equals("=")) {
            answer = (n >= m) ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = (n <= m) ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = (n > m) ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            answer = (n < m) ? 1 : 0;
        }

        return answer;
    }
}