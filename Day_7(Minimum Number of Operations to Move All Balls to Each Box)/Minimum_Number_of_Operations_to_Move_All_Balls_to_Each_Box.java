class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        int len = boxes.length();
        int count = 0;
        int operation = 0;
        for(int i=0;i<len;i++){
            res[i] += operation;
            count += boxes.charAt(i) - '0';
           operation += count;
        }
        operation = 0; count = 0;
        for(int i=len - 1;i >= 0;i--){
            res[i] += operation;
            count += boxes.charAt(i) - '0';
            operation += count;
        }
        return res;
    }
}