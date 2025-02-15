class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> n = new PriorityQueue<>();
        int cnt = 0;
        for(long num: nums){
            n.add(num);
        }
        while(n.peek() < k && n.size() > 1){
            long first = n.remove();
            long second = n.remove();
            long add = Math.min(first, second) * 2 + Math.max(first, second);
            n.add(add);
            cnt++;
        }
        return cnt;
    }
}