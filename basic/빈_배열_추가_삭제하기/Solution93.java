package basic.빈_배열_추가_삭제하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution93 {
    public static void main(String[] args) {
        Solution93 solution = new Solution93();
        runTest(solution, new int[]{ 3, 2, 4, 1, 3 }, new boolean[]{ true, false, true, false, false });
    }

    private static void runTest(Solution93 solution, int[] arr, boolean[] flag) {
        int[] result = solution.solution(arr, flag);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(arr), Arrays.toString(flag), Arrays.toString(result));
    }

    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}