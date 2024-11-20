package basic.접미사_인지_확인하기;

public class Solution45 {
    public static void main(String[] args) {
        Solution45 solution = new Solution45();
        runTest(solution, "banana", "ana");
        runTest(solution, "banana", "nan");
        runTest(solution, "banana", "wxyz");
        runTest(solution, "banana", "abanana");
    }

    private static void runTest(Solution45 solution, String my_string, String is_suffix) {
        int result = solution.solution(my_string, is_suffix);
        System.out.printf("solution(%s %s) = %d%n", my_string, is_suffix,result);
    }

    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}