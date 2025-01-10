class Solution {
    private boolean isPrefixAndSuffix(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 > len2){
             return false;
        }
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
    public int countPrefixSuffixPairs(String[] s) {
        int n = s.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(s[i], s[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}