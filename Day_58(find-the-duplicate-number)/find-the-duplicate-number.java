class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        int slowprevious = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }
        while (slow != slowprevious) {
            slow = nums[slow];
            slowprevious = nums[slowprevious];
        }
        return slow;        
    }
}