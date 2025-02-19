class Solution {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        traverse(arr, new boolean[arr.length]);
        return count - 1;
    }
    int count = 0;
    public void traverse(char arr[], boolean used[]) {
        count++;
        for (int i = 0; i <arr.length; i++) {
            if (used[i] || i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            traverse(arr, used);
            used[i] = false;
        }
    }
}