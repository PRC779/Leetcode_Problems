class Solution {
    public void rotate(int[] nums, int k) {
        int len  = nums.length;
          int[] res = new int[len];
        if(k > len){
        k = k%len;
        }
        for(int i=0;i<k;i++){
            res[i] = nums[len-k+i];
        }
        int j=0;
        for(int i=k; i<len;i++){
            res[i] = nums[j];
            j++;
        }
    System.arraycopy(res,0,nums,0,len);
    }
}