class Solution {
    public int countServers(int[][] grid) {
        int[] row= new int[grid.length];
        int[] column = new int[grid[0].length];
        int total=0;
        for(int i=0;i<grid.length;i++){
            int count=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    column[j]++;
                    count++;
                }
            }
            row[i]=count;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1&&(row[i]>1||column[j]>1)){
                    total++;
                }
            }
        }
        return total;
    }
}