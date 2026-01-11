class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int n = nums.length;

        for(int i=0;i<n;i++){
            res[(i+k)%n]=nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
}