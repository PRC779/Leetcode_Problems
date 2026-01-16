class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < n; ++i) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]){return false;}
            map1[s.charAt(i)] = map2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}