package basic.문자열_곱하기;

public class Solution13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();

        String solution = solution13.solution("stringstringstring", 3);
        System.out.println("solution = " + solution);
    }

    public String solution(String my_string, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            result.append(my_string);
        }

        return result.toString();
    }
}