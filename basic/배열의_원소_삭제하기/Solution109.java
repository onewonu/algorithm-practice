package basic.배열의_원소_삭제하기;

import java.util.Arrays;
import java.util.HashSet;

public class Solution109 {
    public static void main(String[] args) {
        Solution109 solution = new Solution109();
        runTest(solution, new int[] { 293, 1000, 395, 678, 94 }, new int[] { 94, 777, 104, 1000, 1, 12 });
        runTest(solution, new int[] { 110, 66, 439, 785, 1 }, new int[] { 377, 823, 119, 43 });
    }

    private static void runTest(Solution109 solution, int[] arr, int[] delete_list) {
        int[] result = solution.solution(arr, delete_list);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(arr), Arrays.toString(delete_list), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        int[] result = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                result[index++] = num;
            }
        }

        return Arrays.copyOf(result, index);
    }
}