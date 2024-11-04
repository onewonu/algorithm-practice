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

    public int solution(int a, int b, int c, int d) {

        int[] dice = {a, b, c, d};

        HashMap<Integer, Integer> countDice = new HashMap<>();

        for (int number : dice) {
            countDice.put(number, countDice.getOrDefault(number, 0) + 1);
            System.out.println(countDice);
        }

        // countDice.size() == 1

        // TODO: countDice.size() == 2 일 경우, (세 주사위에서 나온 숫자가 p로 같고) 와 (두 개씩 같은 값의 사이즈가 같다) 의 결과가 같음
        /*
            {4=1}
            {1=1, 4=1}
            {1=1, 4=2}
            {1=1, 4=3}
            solution(4, 1, 4, 4) = 0
            {6=1}
            {3=1, 6=1}
            {3=2, 6=1}
            {3=2, 6=2}
            solution(6, 3, 3, 6) = 0
        */

        // countDice.size() == 3

        return 0;
    }
}