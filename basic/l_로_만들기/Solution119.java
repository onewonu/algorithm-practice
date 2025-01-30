package basic.l_로_만들기;

public class Solution119 {
    public static void main(String[] args) {
        Solution119 solution = new Solution119();
        runTest(solution, "abcdevwxyz");
        runTest(solution, "jjnnllkkmm");
    }

    private static void runTest(Solution119 solution, String myString) {
        String result = solution.solution(myString);
        System.out.printf("solution(%s) = %s%n", myString, result);
    }

    public String solution(String myString) {
        char[] chars = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 'l') {
                chars[i] = 'l';
            }
        }

        return new String(chars);
    }
}