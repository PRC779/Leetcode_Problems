class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        int len = s.length();
        for(int i=0; i<len; i++){
            freq[s.charAt(i) - 'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                if(freq[i]%2 == 0){
                    count+=2;
                }else{
                    count+=1;
                }
            }
        }
        return count;
    }
}