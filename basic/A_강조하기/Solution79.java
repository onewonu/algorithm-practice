package basic.A_강조하기;

public class Solution79 {
    public static void main(String[] args) {
        Solution79 solution = new Solution79();
        runTest(solution, "abstract algebra");
        runTest(solution, "PrOgRaMmErS");
    }

    private static void runTest(Solution79 solution, String myString) {
        String result = solution.solution(myString);
        System.out.printf("solution(%s) = %s%n", myString, result);
    }

    public String solution(String myString) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char charAt = myString.charAt(i);
            if (charAt == 'a' || charAt == 'A') {
                builder.append(Character.toUpperCase(charAt));
            } else {
                builder.append(Character.toLowerCase(charAt));
            }
        }

        return builder.toString();
    }
}