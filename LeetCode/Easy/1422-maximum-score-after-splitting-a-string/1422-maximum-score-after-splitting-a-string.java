class Solution {
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int totalOnes = 0;
        
        for (char c : chars) {
            if (c == '1') {
                totalOnes++;
            }
        }
        
        int maxScore = 0;
        int leftZeros = 0;
        int leftOnes = 0;
        
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '0') {
                leftZeros++;
            } else {
                leftOnes++;
            }
            
            int currentScore = leftZeros + (totalOnes - leftOnes);
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
    }
}