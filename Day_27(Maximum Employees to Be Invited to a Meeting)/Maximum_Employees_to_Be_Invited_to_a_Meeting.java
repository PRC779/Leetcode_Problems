class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] indegrees = new int[n];
        int[] depths = new int[n];
        for (int i = 0; i < n; i++) {
            indegrees[favorite[i]]++;
        }
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegrees[i] == 0) {
                deque.offerLast(i);
            }
            depths[i] = 1;
        }
        while (!deque.isEmpty()) {
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                Integer cur_node = deque.pollFirst();
                int next = favorite[cur_node];
                depths[next] = Math.max(depths[next], depths[cur_node] + 1);
                indegrees[next]--;
                if (indegrees[next] == 0) deque.offerLast(next);
            }
        }
        int res = findLoops2ConstructMaxCircularTable(indegrees, depths, favorite);
        return res;
    }
    private int findLoops2ConstructMaxCircularTable(int[] indegrees, int[] depths, int[] favorite) {
        int n = indegrees.length;
        int sumOfLoopsOfLengthEQ2 = 0;
        int maxLoopOfLengthGE3 = 0;
        for (int i = 0; i < n; i++) {
            while (indegrees[i] != 0) {
                indegrees[i]--;
                int temp_node = i;
                int loop_n = 1;
                while (favorite[temp_node] != i) {
                    loop_n++;
                    temp_node = favorite[temp_node];
                    indegrees[temp_node]--;
                }
                if (loop_n == 2) {
                    sumOfLoopsOfLengthEQ2 += depths[i] + depths[temp_node];
                } else {
                    maxLoopOfLengthGE3 = Math.max(maxLoopOfLengthGE3, loop_n);
                }
            }
        }
        return Math.max(maxLoopOfLengthGE3, sumOfLoopsOfLengthEQ2);
    }
}