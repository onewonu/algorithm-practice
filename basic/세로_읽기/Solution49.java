package basic.세로_읽기;

public class Solution49 {
    public static void main(String[] args) {
        Solution49 solution = new Solution49();
        runTest(solution, "ihrhbakrfpndopljhygc", 4, 2);
        runTest(solution, "programmers", 1, 1);
    }

    private static void runTest(Solution49 solution, String my_string, int m, int c) {
        String result = solution.solution(my_string, m, c);
        System.out.printf("solution(%s %d %d) = %s%n", my_string, m, c, result);
    }

    public String solution(String my_string, int m, int c) {
        int row = my_string.length() / m;
        int col = m;

        if(my_string.length() == row) {
            return my_string;
        } else {
            String[][] myStrings = new String[row][col];
            for (int i = 0; i < myStrings.length; i++) {
                for (int j = 0; j < myStrings[i].length; j++) {
                    myStrings[i][j] = String.valueOf(my_string.charAt(i * m + j));
                }
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < myStrings.length; i++) {
                builder.append(myStrings[i][c - 1]);
            }
            return builder.toString();
        }
    }
}