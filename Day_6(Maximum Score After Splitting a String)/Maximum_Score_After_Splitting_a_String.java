class Solution {
    public int maxScore(String s) {
       
        int NumRHS, NumLHS;
        NumRHS = 0;
        NumLHS = 0;
        int maximum_score = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 49)  NumRHS++;
        }
        for(int i = 0; i<s.length()-1; i++){
             if(s.charAt(i) == 48) NumLHS++;
             else  NumRHS--;

             if((NumLHS +  NumRHS) > maximum_score){
                maximum_score =NumLHS + NumRHS;
             }
        }
        return maximum_score ;
    }
}