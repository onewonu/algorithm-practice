package basic.더_크게_합치기;

public class Solution14 {
    public static void main(String[] args) {
        Solution14 Solution14 = new Solution14();

        int solution = Solution14.solution(9, 91);
        System.out.println("solution = " + solution);
    }

    public int solution(int a, int b) {
        int answer = 0;

        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);

        answer = Math.max(ab, ba);
        return answer;
    }
}