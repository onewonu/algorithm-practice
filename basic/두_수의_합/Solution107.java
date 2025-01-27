package basic.두_수의_합;

public class Solution107 {
    public static void main(String[] args) {
        Solution107 solution = new Solution107();
        //runTest(solution, "582", "734");
        runTest(solution, "18446744073709551615", "287346502836570928366");
        //runTest(solution, "0", "0");
    }

    private static void runTest(Solution107 solution, String a, String b) {
        String result = solution.solution(a, b);
        System.out.printf("solution(%s, %s) = %s%n", a, b, result);
    }

    public String solution(String a, String b) {
        String repeat = "";
        if (a.length() < b.length()) {
            repeat = "0".repeat(b.length() - a.length()) + a;
        } else if (a.length() > b.length()) {
            repeat = "0".repeat(a.length() - b.length()) + b;
        }

        int carry = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = repeat.length() - 1; i >= 0; i--) {
            int a1 = 0;
            int b1 = 0;
            int sum;
            int remainder;

            if (repeat.charAt(i) != 0) {
                a1 = repeat.charAt(i) - '0';
            }

            if (b.charAt(i) != 0) {
                b1 = b.charAt(i) - '0';
            }

            sum = a1 + b1 + carry;
            carry = 0;

            if (sum > 9) {
                carry = sum / 10;
                remainder = sum % 10;
                answer.append(remainder);
            } else {
                answer.append(sum);
            }
        }

        return answer.reverse().toString();
    }
}