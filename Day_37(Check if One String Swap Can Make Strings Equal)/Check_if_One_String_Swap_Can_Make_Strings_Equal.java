class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int counts=0;
        int len = s1.length();
        int[] mismatch=new int[2];
        if(s1.equals(s2))
        {
            return true;
        }
        else{
        for(int i=0;i<len;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(counts==2)
                {
                    return false;
                }
                mismatch[counts]=i;
                counts++;
            }
        }
        if(counts==2)
        {            int i=mismatch[0];
                     int j=mismatch[1];
            return(s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i));
        }
        }
        return false;
    }
}