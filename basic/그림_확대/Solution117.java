package basic.그림_확대;

import java.util.Arrays;

public class Solution117 {
    public static void main(String[] args) {
        Solution117 solution = new Solution117();
        runTest(solution
                , new String[] {
                        ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."
                }
                , 2
        );

        runTest(solution, new String[] { "x.x", ".x.", "x.x" }, 3);
    }

    private static void runTest(Solution117 solution, String[] picture, int k) {
        String[] result = solution.solution(picture, k);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(picture), Arrays.toString(result));
    }

    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            StringBuilder expandedRow = new StringBuilder();

            for (char c : picture[i].toCharArray()) {
                expandedRow.append(String.valueOf(c).repeat(k));
            }

            String row = expandedRow.toString();
            for (int j = 0; j < k; j++) {
                answer[i * k + j] = row;
            }
        }

        return answer;
    }
}