package basic.문자열_바꿔서_찾기;

public class Solution89 {
    public static void main(String[] args) {
        Solution89 solution = new Solution89();
        runTest(solution, "ABBAA", "AABB");
        runTest(solution, "ABAB", "ABAB");
    }

    private static void runTest(Solution89 solution, String myString, String pat) {
        int result = solution.solution(myString, pat);
        System.out.printf("solution(%s, %s) = %d%n", myString, pat, result);
    }

    public int solution(String myString, String pat) {
        char[] charArray = myString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A') {
                charArray[i] = 'B';
            } else if (charArray[i] == 'B') {
                charArray[i] = 'A';
            }
        }

        String changedMyString = String.valueOf(charArray);
        boolean contains = changedMyString.contains(pat);
        return contains ? 1 : 0;
    }
}