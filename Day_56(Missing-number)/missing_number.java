class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int numbers = nums.length;
        int sum = n*(n+1)/2;
        int vals= 0;
        for(int i = 0;i<numbers;i++){
            vals+=nums[i];
        }
    return sum-vals;
    }
}
//XOR
//  public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int missingnumbers = n;
//         for (int i = 0; i < n; i++) {
//             missingnumbers ^= i ^ nums[i];
//         }
//         return missingnumbers;
//     }
