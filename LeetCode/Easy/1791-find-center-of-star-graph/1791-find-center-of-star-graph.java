class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int[] edge : edges) {
            for (int num : edge) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        int mostKey = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostKey = entry.getKey();
            }
        }

        return mostKey;
    }
}