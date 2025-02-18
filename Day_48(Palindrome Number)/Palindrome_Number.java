class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int len = num.length();
        for(int i=0;i<len;i++){
            if(num.charAt(i) != num.charAt(len - 1 -i)){
               return false ;
            }
        }
        return true ;
    }
}