package basic._9로_나눈_나머지;

public class Solution39 {
    public static void main(String[] args) {
        Solution39 solution = new Solution39();
        runTest(solution, "123");
        runTest(solution, "78720646226947352489");
    }

    private static void runTest(Solution39 solution, String number) {
        int result = solution.solution(number);
        System.out.printf("solution(%s) = %d%n", number , result);
    }

    public int solution(String number) {
        int answer = 0;

        for (char c : number.toCharArray()) answer += c - '0';
        answer = answer % 9;

        return answer;
    }
}