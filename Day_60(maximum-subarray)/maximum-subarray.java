class Solution {
    //Kadane's Algorithm Use
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int current=0;

        for(int i=0;i<nums.length;i++){
            current =Math.max(nums[i],current += nums[i]);
            res=Math.max(res,current);
            
            if(current<0){
                current=0;
            }

        }
        return res;
    }
}