package basic.문자_리스트를_문자열로_변환하기;

public class Solution12 {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String solution = solution(arr1);
        System.out.println("solution = " + solution);
    }

    public static String solution(String[] arr) {
        return String.join("", arr);
    }
}