class Solution {
    boolean punishN(int ind, int n, int x, String s){
        int len = s.length();
        if(ind == len){
            if(x==n){
                return true;
            }
        }
        for(int j=ind; j<len; j++){
            if(punishN(j+1, n, x+Integer.valueOf(s.substring(ind,j+1)), s)){
                return true;
            }
        }
        return false;
    }
     public int punishmentNumber(int n) {
        int cnt=0;
        for(int i=1; i<=n; i++){
            if(punishN(0,i,0,Integer.toString(i*i))){
                cnt+=i*i;
            }
        }
        return cnt;
    }
}