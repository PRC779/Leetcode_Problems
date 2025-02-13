class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int sumOfDigits = 0;
            int n = nums[i];
            while(n > 0) {
                sumOfDigits += n % 10;
                n /= 10;
            }
            if(map.containsKey(sumOfDigits)) {
                if(map.get(sumOfDigits) + nums[i] > max) {
                    max = map.get(sumOfDigits) + nums[i];
                }
                map.put(sumOfDigits, Math.max(map.get(sumOfDigits), nums[i]));
            } else {
                map.put(sumOfDigits, nums[i]);
            }
        }
        return max;
    }
}