package basic.주사위_게임_3;

import java.util.HashMap;

public class Solution37 {
    public static void main(String[] args) {
        Solution37 solution = new Solution37();
        runTest(solution, 2, 2, 2, 2);
        runTest(solution, 4, 1, 4, 4);
        runTest(solution, 6, 3, 3, 6);
        runTest(solution, 2, 5, 2, 6);
        runTest(solution, 6, 4, 2, 5);
    }

    private static void runTest(Solution37 solution, int a, int b, int c, int d) {
        int result = solution.solution(a, b, c, d);
        System.out.printf("solution(%d, %d, %d, %d) = %d%n", a, b, c, d, result);
    }

    /**
     * 주사위 네 개의 값을 기반으로 특정 패턴에 따라 점수를 계산하는 함수
     *
     * @param a 주사위 1의 값
     * @param b 주사위 2의 값
     * @param c 주사위 3의 값
     * @param d 주사위 4의 값
     * @return 특정 조건에 따른 점수 반환
     */
    public int solution(int a, int b, int c, int d) {

        int[] dice = {a, b, c, d};
        HashMap<Integer, Integer> countDice = new HashMap<>();

        /**
         * 주사위 값의 빈도를 계산하여 HashMap 에 저장
         * key: 주사위 숫자
         * value: 해당 숫자가 나온 횟수
         */
        for (int number : dice) countDice.put(number, countDice.getOrDefault(number, 0) + 1);

        /**
         * 조건 1: 모든 숫자가 같은 경우 (countDice.size() == 1)
         * 모든 주사위 숫자가 동일할 때, 점수는 1111 * 해당 숫자
         */
        if (countDice.size() == 1) {
            return 1111 * a;

            /**
             * 조건 2: 두 가지 숫자가 나왔을 때 (countDice.size() == 2)
             * - 세 개의 동일한 숫자와 한 개의 다른 숫자가 있는 경우
             * - 두 숫자가 각각 두 번씩 나온 경우
             */
        } else if (countDice.size() == 2) {
            int p = 0, q = 0;

            for (Integer key : countDice.keySet()) {
                if (countDice.get(key) == 3) p = key;
                else q = key;
            }

            if (countDice.containsValue(3)) return (int) Math.pow((10 * p + q), 2);
            else return (p + q) * Math.abs(p - q);

            /**
             * 조건 3: 세 가지 숫자가 나왔을 때 (countDice.size() == 3)
             * - 특정 숫자가 두 번 나오고 나머지 두 숫자가 각각 한 번씩 나오는 경우
             */
        } else if (countDice.size() == 3) {
            int q = 0, r = 0;

            for (Integer key : countDice.keySet()) {
                if (countDice.get(key) == 1) {
                    if (q == 0) q = key;
                    else r = key;
                }
            }

            return q * r;

            /**
             * 조건 4: 네 가지 숫자가 모두 다를 때 (countDice.size() == 4)
             * - 모든 주사위 숫자가 유일하게 한 번씩 나오는 경우
             * - 이 경우 가장 작은 숫자를 점수로 반환
             */
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }
}