class Solution {
    public long gridGame(int[][] grid) {
        int len=grid[0].length;
        long prev[]=new long[len];
        long suf[] = new long[len];
            for(int i = 1;i<len;i++){
             prev[i]=prev[i-1]+grid[0][i];
        }
              for(int i =len-2;i>=0;i--){
                suf[i]=grid[1][i]+suf[i+1];
        }
        long ans=Math.min(prev[len-1],suf[0]);
            for(int i=1;i<len-1;i++){
                long cur=Math.max(prev[len-1]-prev[i],suf[0]-suf[i]);
                    if(cur>0){
                        ans=Math.min(ans,cur);
                    }
        }
        return ans;
    }
}