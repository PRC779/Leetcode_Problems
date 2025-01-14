class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        int close = 0;
        int open = 0;
        if (n % 2 != 0){
            return false;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '(' || locked.charAt(i) == '0'){
                open++;
            }else{
                close++;
            }
            if(open < close){
                return false;
            }
        }
        open = 0;
        close = 0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == ')' || locked.charAt(i) == '0'){
                close++;
            }else{
                open++;
            }
            if(close < open){
                return false;
            }
        }
        return true;
    }
}