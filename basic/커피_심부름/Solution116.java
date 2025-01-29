package basic.커피_심부름;

import java.util.Arrays;

public class Solution116 {
    public static void main(String[] args) {
        Solution116 solution = new Solution116();
        runTest(solution, new String[] { "cafelatte", "americanoice", "hotcafelatte", "anything" });
        runTest(solution, new String[] { "americanoice", "americano", "iceamericano" });
    }

    private static void runTest(Solution116 solution, String[] order) {
        int result = solution.solution(order);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(order), result);
    }

    public int solution(String[] order) {
        int totalPrice = 0;
        for (String menu : order) {
            if (menu.contains("americano") || menu.equals("anything")) {
                totalPrice += 4500;
            } else {
                totalPrice += 5000;
            }
        }

        return totalPrice;
    }
}