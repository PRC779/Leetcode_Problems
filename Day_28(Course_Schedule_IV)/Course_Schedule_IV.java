class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
            List<Integer>[] pre = new List[n];
            Set<Integer>[] next = new HashSet[n];
            int[] nextCount = new int[n];
                for (int i = 0; i < n; i++) {
                    pre[i] = new ArrayList<>();
                    next[i] = new HashSet<>();
                }
                for (int[] p : prerequisites) {
                pre[p[1]].add(p[0]);
                next[p[0]].add(p[1]);
                nextCount[p[0]]++;
                }
                boolean[] used = new boolean[n];
                LinkedList<Integer> list = new LinkedList<>();
                for (int i = 0; i < n; i++) {
                    if (nextCount[i] == 0) {
                        list.add(i);
                        used[i] = true;
                    }
             }
        while (!list.isEmpty()) {
            int remove = list.removeFirst();
            for (int i : pre[remove]) {	
                nextCount[i]--;
                next[i].addAll(next[remove]);
                    if (nextCount[i] == 0) {
                        list.add(i);
                 }
            }
        }
    List<Boolean> res = new ArrayList<>(queries.length);
    for (int[] q : queries) {
        res.add(next[q[0]].contains(q[1]));
    }
    return res;
}
}