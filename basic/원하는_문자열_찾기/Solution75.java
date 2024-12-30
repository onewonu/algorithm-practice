package basic.원하는_문자열_찾기;

public class Solution75 {
    public static void main(String[] args) {
        Solution75 solution = new Solution75();
        runTest(solution, "AbCdEfG", "aBc");
        runTest(solution, "aaAA", "aaaaa");
    }

    private static void runTest(Solution75 solution, String myString, String pat) {
        int result = solution.solution(myString, pat);
        System.out.printf("solution(%s, %s) = %d%n", myString, pat, result);
    }

    public int solution(String myString, String pat) {
        if (myString.length() < pat.length()) return 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        return myString.contains(pat) ? 1 : 0;
    }
}