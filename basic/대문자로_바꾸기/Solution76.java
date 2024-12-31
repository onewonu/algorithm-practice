package basic.대문자로_바꾸기;

public class Solution76 {
    public static void main(String[] args) {
        Solution76 solution = new Solution76();
        runTest(solution, "aBcDeFg");
        runTest(solution, "AAA");
    }

    private static void runTest(Solution76 solution, String myString) {
        String result = solution.solution(myString);
        System.out.printf("solution(%s) = %s%n", myString, result);
    }

    public String solution(String myString) {
        String answer = "";
        return answer;
    }
}