package basic.홀짝에_따라_다른_값_변환하기;

public class Solution18 {
    public static void main(String[] args) {
        Solution18 solution = new Solution18();
        runTest(solution, 7);
        runTest(solution, 10);
    }

    private static void runTest(Solution18 solution, int n) {
        int result = solution.solution(n);
        System.out.printf("solution(%d) = %d%n", n, result);
    }

    public int solution(int n) {
        int answer = 0;

        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }

        return answer;
    }
}