class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        for (int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if (grid[i][j] > 0) {
                    int fishInRegion = nooffish(grid, i, j);
                    maxFish = Math.max(maxFish, fishInRegion);
            }   
            }
        }
        return maxFish;   
    }
    public int nooffish(int[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0){
            return 0;
        }      
        int fishs = grid[i][j];
        grid[i][j] = 0;
        fishs += nooffish(grid, i + 1, j);
        fishs += nooffish(grid, i - 1, j);
        fishs += nooffish(grid, i, j + 1);
        fishs += nooffish(grid, i, j - 1);
        return fishs;
    }
}