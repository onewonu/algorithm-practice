class Solution {
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int maxScore = 0;
        
        for (int i = 1; i < chars.length; i++) {
            int zero = 0;
            int one = 0;
            
            for (int j = 0; j < i; j++) {
                if (chars[j] == '0') {
                    zero++;
                }
            }
            
            for (int j = i; j < chars.length; j++) {
                if (chars[j] == '1') {
                    one++;
                }
            }
            
            int currentScore = zero + one;
            
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
    }
}