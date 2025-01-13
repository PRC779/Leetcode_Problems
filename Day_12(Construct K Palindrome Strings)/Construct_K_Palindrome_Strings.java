class Solution {
    public boolean canConstruct(String s, int k) {
        int[] count = new int[26];
        int odd = 0;
        if (s == null || s.isEmpty() || s.length() < k){
            return false;
        }
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        for (int i = 0; i < 26 ; i++) {
            if (count[i] % 2 != 0) odd++;
        }
        return odd <= k;
    }
}