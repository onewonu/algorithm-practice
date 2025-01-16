class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        if ((arrLength & (arrLength - 1)) == 0) {
            return arr;
        }

        int nearestPowerOfTwo = 1;
        while (nearestPowerOfTwo < arrLength) {
            nearestPowerOfTwo <<= 1;
        }

        int[] answer = new int[nearestPowerOfTwo];
        System.arraycopy(arr, 0, answer, 0, arrLength);
        return answer;
    }
}