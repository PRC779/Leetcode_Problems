class Solution {
    public int minimizeXor(int num1, int num2) {
        int onBitsX = Integer.bitCount(num2);
        int x = 0;
        for(int i=31; i>=0; i--){
            if((num1 & (1<<i)) != 0 && onBitsX > 0){
                x = x | (1<<i);
                onBitsX--;
            }
            if(onBitsX == 0)
                break;
        }
             if(onBitsX > 0){
              for (int i = 0; i < 32; i++) {
                if ((x & (1 << i)) == 0) {
                    x |= (1 << i);
                    onBitsX--;
                }
                if(onBitsX == 0)
                break;
              }
             }
    return x;
    }
}