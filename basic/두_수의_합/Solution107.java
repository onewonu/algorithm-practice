package basic.두_수의_합;

public class Solution107 {
    public static void main(String[] args) {
        Solution107 solution = new Solution107();
        runTest(solution, "582", "734");
        runTest(solution, "18446744073709551615", "287346502836570928366");
        runTest(solution, "0", "0");
    }

    private static void runTest(Solution107 solution, String a, String b) {
        String result = solution.solution(a, b);
        System.out.printf("solution(%s, %s) = %s%n", a, b, result);
    }

    public String solution(String a, String b) {
        StringBuilder answer = new StringBuilder();

        int maxLength = Math.max(a.length(), b.length());
        a = alignWithZeros(a, maxLength);
        b = alignWithZeros(b, maxLength);

        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int digitA = a.charAt(i) - '0';
            int digitB = b.charAt(i) - '0';
            int sum = digitA + digitB + carry;

            carry = sum / 10;
            answer.append(sum % 10);
        }

        if (carry > 0) {
            answer.append(carry);
        }

        return answer.reverse().toString();
    }

    private String alignWithZeros(String str, int maxLength) {
        return "0".repeat(maxLength - str.length()) + str;
    }
}