package basic.두_수의_연산값_비교하기;

public class Solution15 {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();

        int solution = solution15.solution(2, 91);
        System.out.println("solution = " + solution);
    }

    public int solution(int a, int b) {
        int answer = 0;

        int ab = Integer.parseInt("" + a + b);
        int mul = 2 * a * b;

        answer = Math.max(ab, mul);
        return answer;
    }
}