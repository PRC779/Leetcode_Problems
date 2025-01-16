class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        List<Integer> al = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        int len = a.length;
        int[] ans = new int[len];
        int cnt=0;
        for(int i=0;i<len;i++){
            al.add(a[i]);
            bl.add(b[i]);
            if(a[i]==b[i]){
                cnt++;
            }else{
                if(bl.contains(a[i])){
                    cnt++;
                }
                if(al.contains(b[i])){
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}