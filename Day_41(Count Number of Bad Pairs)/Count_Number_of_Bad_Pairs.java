class Solution {
    public long countBadPairs(int[] nums) {
        long cnt = 0;
        int len = nums.length;
        int[] cumsum = new int[len];
        for(int i=0; i<len; i++){
            cumsum[i] = nums[i] - i;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:cumsum){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i=0; i<len; i++){
            long x = len - map.get(cumsum[i]) - i;
            cnt += x;
            map.put(cumsum[i], map.getOrDefault(cumsum[i], 0) - 1);
        }
        return cnt;
    }
}