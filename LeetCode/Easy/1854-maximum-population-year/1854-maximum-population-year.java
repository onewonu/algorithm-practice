class Solution {
    public int maximumPopulation(int[][] logs) {

        int minYear = logs[0][0];
        int maxYear = logs[0][1];

        for (int i = 1; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];
            
            if (birth < minYear) minYear = birth;
            if (death > maxYear) maxYear = death;
        }

        int maxPopulation = 0;
        int resultYear = minYear;
        
        for (int year = minYear; year <= maxYear; year++) {
            int population = 0;
            
            for (int i = 0; i < logs.length; i++) {
                int birth = logs[i][0];
                int death = logs[i][1];
                
                if (birth <= year && year < death) {
                    population++;
                }
            }
            
            if (population > maxPopulation) {
                maxPopulation = population;
                resultYear = year;
            }
        }

        return resultYear;
    }
}