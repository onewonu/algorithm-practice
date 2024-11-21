package basic.문자열_뒤집기;

public class Solution48 {
    public static void main(String[] args) {
        Solution48 solution = new Solution48();
        runTest(solution, "Progra21Sremm3", 6, 12);
        runTest(solution, "Stanley1yelnatS", 4, 10);
    }

    private static void runTest(Solution48 solution, String my_string, int s, int e) {
        String result = solution.solution(my_string, s, e);
        System.out.printf("solution(%s %d %d) = %s%n", my_string, s, e, result);
    }

    public String solution(String my_string, int s, int e) {
        String answer = "";
        return answer;
    }
}