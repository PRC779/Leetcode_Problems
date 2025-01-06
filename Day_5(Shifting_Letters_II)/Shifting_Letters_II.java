class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
       
        int len = s.length();
        char[] stringCh = s.toCharArray();
        int[] line = new int[len + 1];

        for (int[] shift : shifts) {
            if (shift[2] == 1) {
                line[shift[0]] = line[shift[0]] + 1;
                line[shift[1] + 1] = line[shift[1] + 1] - 1;
            } else {
                line[shift[0]] = line[shift[0]] - 1;
                line[shift[1] + 1] = line[shift[1] + 1] + 1;
            }
        }
        
        int moves = 0;
        for (int i = 0; i < len; i++) {
            moves += line[i];
            int move = (stringCh[i] - 'a' + moves) % 26;
            if (move < 0) {
                move += 26;
            }
            stringCh[i] = (char)('a' + move);
        }
        return new String(stringCh);
    }
}