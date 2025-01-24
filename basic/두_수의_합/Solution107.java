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
        // TODO: 타입을 초과하는 숫자가 주어졌음.
        // TODO: 직접 올림으로 구현 방향성을 선택.

        // TODO: 비교하는 두 수의 숫자의 길이가 다르다면 자리수를 맞춘다.
        String repeat = "";
        if (a.length() < b.length()) {
            repeat = "0".repeat(b.length() - a.length()) + a;
        }

        // TODO: 같은 자리수를 아스키값을 빼서 정수로 만들어 계산한다. 이때, 올림을 유의한다.
        // TODO: 시작인덱스 역순 부터
        int carry = 0;
        for (int i = repeat.length() - 1; i == 0; i--) {
        //for (int i = 0; i < 5; i++) {
            int a1 = 0;
            int b1 = 0;

            if (a.charAt(i) != 0) {
                a1 = repeat.charAt(i) - '0';
            }

            if (b.charAt(i) != 0) {
                b1 = b.charAt(i) - '0';
            }

            int sum = a1 + b1;
            if (sum > 10) {
                carry = sum / 10;
                int test = sum % 10;
            }
        }

        return "";
    }
}