class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length;
        int m=isWater[0].length;
        int temp[][]=new int[n][m];
        int dir[][]={{0,-1},{0,1},{-1,0},{1,0}};
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    temp[i][j]=0;
                    q.add(new int[]{0,i,j});
                }
                else{
                    temp[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int val[]=q.remove();
            int prev=val[0];
            for(int  i=0;i<4;i++){
                int ni=dir[i][0]+val[1];
                int nj=dir[i][1]+val[2];
                if(ni>=0 && ni<n && nj>=0 && nj<m && temp[ni][nj]==-1){
                    temp[ni][nj]=prev+1;
                    q.add(new int[]{prev+1,ni,nj});
                }
            }
        } 
        return temp;
    }
}