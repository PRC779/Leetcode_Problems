class Solution {
    int parent[];
    public int[] findRedundantConnection(int[][] edges) {
        int[] ans = new int[2];
        parent = new int[edges.length+1];
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
        }
        for(int i=0;i<edges.length;i++){
            int x = find_Parent(edges[i][0]);
            int y = find_Parent(edges[i][1]);
            if(x != y)
                parent[y] = x;
            else
            {
                ans[0] = edges[i][0];
                ans[1] = edges[i][1];
            }
        }
        return ans;
    }
    int find_Parent(int x)
    {
        if(parent[x] == x){
            return x;
        }
        else{
                return find_Parent(parent[x]);
        }
    }
}