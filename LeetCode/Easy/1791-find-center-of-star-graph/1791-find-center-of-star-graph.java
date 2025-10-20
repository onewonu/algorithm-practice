class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int[] edge : edges) {
            for (int num : edge) {
                int newCount = countMap.getOrDefault(num, 0) + 1;
                countMap.put(num, newCount);

                // 중심 노드가 모든 간선에 연결 됨, 중심 노드의 차수 = n - 1 = edges.length
                if (newCount == edges.length) {
                    return num;
                }
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