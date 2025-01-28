package basic.부분_문자열인지_확인하기;

public class Solution110 {
    public static void main(String[] args) {
        Solution110 solution = new Solution110();
        runTest(solution, "banana", "ana");
        runTest(solution, "banana", "wxyz");
    }

    private static void runTest(Solution110 solution, String my_string, String target) {
        int result = solution.solution(my_string, target);
        System.out.printf("solution(%s, %s) = %d%n", my_string, target, result);
    }

    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}