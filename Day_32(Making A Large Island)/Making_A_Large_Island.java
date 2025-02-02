class Solution {
    
    int[] dx = {0, -1, 0, 1};
    int[] dy = {-1, 0, 1, 0};
    int newX = 0, newY = 0;
    
    private boolean isSafe(int[][] grid, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;
        
        if(x<0 || x>=n || y<0 || y>=m) {
            return false;
        }
        
        return grid[x][y] == 1;
    }
    
    private void dfsUtil(int[][] grid, int x, int y, int connectedComponentId, int[] connectedComponentSize) {
        grid[x][y] = connectedComponentId; //very important line
        connectedComponentSize[0]++;
        
        for(int k = 0; k<4; k++) {
            newX = x + dx[k];
            newY = y + dy[k];
            
            if(isSafe(grid, newX, newY)) {
                dfsUtil(grid, newX, newY, connectedComponentId, connectedComponentSize);
            }
        }
    }
    
    private boolean isSafeIndex(int[][] grid, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;
        
        if(x<0 || x>=n || y<0 || y>=m) {
            return false;
        }
        
        return grid[x][y] > 1;
    }
    
    private int dfs(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int connectedComponentId = 2;
        int[] connectedComponentSize = new int[1];
        
        int maxSizeSoFar = Integer.MIN_VALUE;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == 1) {
                    connectedComponentSize[0] = 0;
                    dfsUtil(grid, i, j, connectedComponentId, connectedComponentSize);
                    map.put(connectedComponentId, connectedComponentSize[0]);
                    maxSizeSoFar = Math.max(maxSizeSoFar, connectedComponentSize[0]);
                    connectedComponentId++;
                }
            }
        }
        int maxSizePossible = maxSizeSoFar;
        int x = 0, y = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(grid[i][j] == 0) {
                    Set<Integer> set = new HashSet<>();

                    x = i;
                    y = j;
                    
                    for(int k = 0; k<4; k++) {
                        newX = x + dx[k];
                        newY = y + dy[k];
                        
                        if(isSafeIndex(grid, newX, newY)) {
                            set.add(grid[newX][newY]);
                        }
                    }
                    
                    int totalArea = 1;
                    for(int componentId: set) {
                        totalArea += map.get(componentId);
                    }  
                    maxSizePossible = Math.max(maxSizePossible, totalArea);
                }
            }
        }
        return maxSizePossible;
    }
    public int largestIsland(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        return dfs(grid);
    }
}