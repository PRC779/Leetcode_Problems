class Solution {
    public String smallestNumber(String pattern) {
        char[] charArr = pattern.toCharArray();
        int[] arr = new int[pattern.length() + 1];
        int cur = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = cur;

            int prevIndex = i - 1;
            while (prevIndex >= 0 && charArr[prevIndex] == 'D') {
                arr[prevIndex]++;
                prevIndex--;
            }
            if (i < charArr.length && charArr[i] == 'I')
                cur = arr[prevIndex + 1] + 1;
        }

        StringBuilder str = new StringBuilder();
        for (var item : arr)
            str.append(item);

        return str.toString();
    }
}