class Solution {
    public int waysToSplitArray(int[] numbers) {
        double sum=0;
        int count=0;
        int num=numbers.length;
        for(int i=0 ;i<num ;i++){
            sum +=numbers[i];
        }
        double add=0;
         for(int i=0;i<num-1;i++){
            add +=numbers[i];
            sum=sum-numbers[i];
            if(add>=sum){
                count++;
            }
         }
         return count;
    }
}