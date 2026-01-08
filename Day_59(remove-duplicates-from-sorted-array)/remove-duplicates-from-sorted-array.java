class Solution {
    public int removeDuplicates(int[] nums) {
        int numbers = nums.length;
        int ele = 0;
        for (int i = 1; i < numbers; i++) {
            if (nums[ele] != nums[i]) {
                nums[++ele] = nums[i];                
            }
        }
        return ++ele;
    }
}