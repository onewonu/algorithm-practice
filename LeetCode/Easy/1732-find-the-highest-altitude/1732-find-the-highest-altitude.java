class Solution {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int prefix[] = new int[len + 1];

        int index = 0;
        for (int g : gain) {
            prefix[index + 1] = prefix[index] + gain[index];
            index++;
        }

        int max = prefix[0];
        for (int p : prefix) {
            if (p > max) {
                max = p;
            }
        }

        return max;
    }
}