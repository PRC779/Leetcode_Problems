class Solution {
    
    public int tupleSameProduct(int[] nums) {
        int len = nums.length;        
        if(nums == null || len == 0){
            return 0;
        }
        
        Map<Integer, Integer> mulToNumPairs = new HashMap<>();
        
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                int mul = nums[i]*nums[j];
                mulToNumPairs.put(mul, mulToNumPairs.getOrDefault(mul, 0) +1);
            }
        }
        
        int numTuples = 0;
        for(int val : mulToNumPairs.values()){            
            if(val > 1){
                int combinations = (val * (val-1))/2;
                numTuples += (8 * combinations);
            }
        }
        return numTuples;
    }
}