package basic._0_떼기;

public class Solution106 {
    public static void main(String[] args) {
        Solution106 solution = new Solution106();
        runTest(solution, "0010");
        runTest(solution, "854020");
    }

    private static void runTest(Solution106 solution, String n_str) {
        String result = solution.solution(n_str);
        System.out.printf("solution(%s) = %s%n", n_str, result);
    }

    public String solution(String n_str) {
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                return n_str.substring(i);
            }
        }
        return "";
    }
}