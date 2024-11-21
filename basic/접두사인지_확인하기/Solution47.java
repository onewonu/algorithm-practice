package basic.접두사인지_확인하기;

public class Solution47 {
    public static void main(String[] args) {
        Solution47 solution = new Solution47();
        runTest(solution, "banana", "ban");
        runTest(solution, "banana", "nan");
        runTest(solution, "banana", "abcd");
        runTest(solution, "banana", "bananan");
    }

    private static void runTest(Solution47 solution, String my_string, String is_prefix) {
        int result = solution.solution(my_string, is_prefix);
        System.out.printf("solution(%s %s) = %d%n", my_string, is_prefix, result);
    }

    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}