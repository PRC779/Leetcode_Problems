class Solution {
    public int removeDuplicates(int[] nums){
        int cntk = 0;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] != nums[cntk]){
                cntk++;
                nums[cntk] = nums[i];
            }
        }
        return cntk+1;
    }
}