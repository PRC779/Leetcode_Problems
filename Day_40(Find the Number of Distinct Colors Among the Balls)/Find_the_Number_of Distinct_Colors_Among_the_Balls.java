class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> color = new HashMap<>();
        HashMap<Integer,Integer> ball = new HashMap<>();
        int [] res = new int [queries.length];
        for(int i=0;i<queries.length;i++){
            int newball = queries[i][0];
            int col = queries[i][1];
            if(ball.containsKey(newball)){
                int prev = ball.get(newball);
                color.put(prev,color.getOrDefault(prev,0)-1);
                if(color.get(prev)==0){
                    color.remove(prev);
                }
            }
            ball.put(newball,col);
            color.put(col,color.getOrDefault(col,0)+1);
            res[i]=color.size();
        }
        return res;
    }
}