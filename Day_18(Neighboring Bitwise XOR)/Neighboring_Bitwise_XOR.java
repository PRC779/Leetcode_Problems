class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int cnt = 0;
        int len = derived.length;
        for(int i =0;i<len;i++){
           cnt = cnt ^ derived[i];
        }
        if(cnt == 0){
            return true;
        }
        return false;
    }
}