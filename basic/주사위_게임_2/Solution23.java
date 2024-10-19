package basic.주사위_게임_2;

public class Solution23 {
    public static void main(String[] args) {
        Solution23 solution = new Solution23();
        runTest(solution, 2, 6, 1);
        runTest(solution, 5, 3, 3);
        runTest(solution, 4, 4, 4);
    }

    private static void runTest(Solution23 solution, int a, int b, int c) {
        int result = solution.solution(a, b, c);
        System.out.printf("solution(%d, %d, %d) = %s%n", a, b, c, result);
    }

    public int solution(int a, int b, int c) {
        int answer = 0;

        int sum = a + b + c;

        if (a == b && b == c) {
            answer = sum * calculatePowerSum(a, b, c, 2) * calculatePowerSum(a, b, c, 3);
        } else if (a == b || b == c || a == c) {
            answer = sum * calculatePowerSum(a, b, c, 2);
        } else {
            answer = sum;
        }

        return answer;
    }

    public static int calculatePowerSum(int a, int b, int c, int power) {
        return (int) (Math.pow(a, power) + Math.pow(b, power) + Math.pow(c, power));
    }
}