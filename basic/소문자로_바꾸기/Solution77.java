package basic.소문자로_바꾸기;

public class Solution77 {
    public static void main(String[] args) {
        Solution77 solution = new Solution77();
        runTest(solution, "aBcDeFg");
        runTest(solution, "aaa");
    }

    private static void runTest(Solution77 solution, String myString) {
        String result = solution.solution(myString);
        System.out.printf("solution(%s) = %s%n", myString, result);
    }

    public String solution(String myString) {
        String answer = "";
        return answer;
    }
}