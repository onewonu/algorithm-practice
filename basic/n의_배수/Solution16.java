package basic.n의_배수;

public class Solution16 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();

        int solution = solution16.solution(98, 2);
        System.out.println("solution = " + solution);
    }

    public int solution(int num, int n) {
        int answer = 0;
        answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}