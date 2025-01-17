package basic.문자열_묶기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution98 {
    public static void main(String[] args) {
        Solution98 solution = new Solution98();
        runTest(solution, new String[] { "a","bc","d","efg","hi" });
    }

    private static void runTest(Solution98 solution, String[] strArr) {
        int result = solution.solution(strArr);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(strArr), result);
    }

    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            lengthCount.put(
                    length
                    , lengthCount.getOrDefault(length, 0) + 1
            );
        }

        int maxSize = 0;
        for (int count : lengthCount.values()) {
            maxSize = Math.max(maxSize, count);
        }
        return maxSize;
    }
}