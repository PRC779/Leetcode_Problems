class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int len=nums.length;
        int[][] arr=new int[len][2];
        for(int i=0;i<len;i++) {
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        for(int i=0, j;i<len;i++) {
            for(j=i;j<len && arr[j][0]-arr[(j-1)<i?i:j-1][0] <= limit;j++);
            j=j-1;
            List<int[]> lis=new ArrayList<>();
            for(int k=i;k<=j;k++) lis.add(new int[]{arr[k][0], arr[k][1]});
            Collections.sort(lis, (a,b)->a[1]-b[1]);

            int k=i;
            for(int[] tup: lis) {
                nums[tup[1]]=arr[k][0];
                k++;
            }
            i=j;
        }
        return nums;
    }
}