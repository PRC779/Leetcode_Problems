class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = words.length;
        int count = 0;
        for(int i=0; i<len; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}