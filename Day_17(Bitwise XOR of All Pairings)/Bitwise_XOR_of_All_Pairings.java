class Solution {
public int xorAllNums(int[] nums1, int[] nums2) {
        int len = nums1.length;
         int len1 = nums2.length;
        int ans1=0;
        int ans2=0;
            for(int i=0;i<len;i++){
            ans1=ans1^nums1[i];
                }
                for(int j=0;j<len1;j++){
                    ans2=ans2^nums2[j];
                    }
        int result=0;
        if(len %2!=0){
             result =result^ans2;
        }
        if(len1 %2!=0){
            result =result^ans1;
        }
    return result;
    }
}