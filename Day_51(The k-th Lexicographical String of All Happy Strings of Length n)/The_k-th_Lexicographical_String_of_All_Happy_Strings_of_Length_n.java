class Solution {
    public String getHappyString(int n, int k) {
        List<String> l = new ArrayList<>();
        char[] c = {'a', 'b', 'c'};
        generateHappyStrings(n, new StringBuilder(), l, c);
        Collections.sort(l);
        return (!l.isEmpty() && k <= l.size()) ? l.get(k - 1) : "";
    }

    private void generateHappyStrings(int n, StringBuilder temp, List<String> l, char[] c) {
        if (temp.length() == n) {
            l.add(temp.toString());
            return;
        }
        for (char value : c) {
            if (temp.length() == 0 || temp.charAt(temp.length() - 1) != value) {
                temp.append(value);
                generateHappyStrings(n, temp, l, c);
                temp.setLength(temp.length() - 1);
            }
        }
    }
}