 class Solution {
    public int countPalindromicSubsequence(String s) {
        int count = 0;
        for(int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            int start = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
            if (last == -1) continue;
            Set<Character> uniqChars = new HashSet<>();
            for(int j = start + 1; j < last; j++) {
                uniqChars.add(s.charAt(j));
            }
            count += uniqChars.size();
        }        
        return count;
    }
}
