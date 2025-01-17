package basic.문자열_묶기;

import java.util.*;

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
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        for (String str : strArr) {
            int length = str.length();
            hashMap.putIfAbsent(length, new ArrayList<>());
            hashMap.get(length).add(str);
        }
        System.out.println("hashMap = " + hashMap);

        int maxSize = 0;
        for (Map.Entry<Integer, List<String>> entry : hashMap.entrySet()) {
            int currentSize = entry.getValue().size();

            if (currentSize > maxSize) {
                maxSize = currentSize;
            }
        }

        return maxSize;
    }
}