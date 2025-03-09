class Solution {
    public String removeOccurrences(String s, String part){
        while(s.contains(part)){
            int i = s.indexOf(part);
            int len = part.length();
            int len2 = s.length();
            s = s.substring(0,i)+s.substring(len+i,len2);
        }
        return s;
    }
}