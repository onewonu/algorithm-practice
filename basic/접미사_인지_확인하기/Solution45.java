package basic.접미사_인지_확인하기;

public class Solution45 {
    public static void main(String[] args) {
        Solution45 solution = new Solution45();
        runTest(solution, "banana", "ana");
        runTest(solution, "banana", "nan");
        runTest(solution, "banana", "wxyz");
        runTest(solution, "banana", "abanana");
    }

    private static void runTest(Solution45 solution, String my_string, String is_suffix) {
        int result = solution.solution(my_string, is_suffix);
        System.out.printf("solution(%s %s) = %d%n", my_string, is_suffix,result);
    }

    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        String[] suffix = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {

            // TODO: 접미사 생성 시 O(n^2) 시간 복잡도를 가진다.
            suffix[i] = my_string.substring(i);

        }

        for (String s : suffix) {
            if (s.equals(is_suffix)) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}