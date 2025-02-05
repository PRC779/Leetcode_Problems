class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr=nums[0];
        int max=0;
        int len = nums.length;
        for(int i=1;i<len;i++){
            if(nums[i-1]<nums[i])curr+=nums[i];
            else{
                max=Math.max(max, curr);
                curr=nums[i];
            }
        }
        max=Math.max(max, curr);
        return max;
    }
}