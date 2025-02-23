class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftside = 0;
        int rightside = height.length-1;
        while(leftside != rightside){
            int tall = Math.min(height[leftside], height[rightside]);
            int wide = rightside - leftside;
            int area = tall * wide;
            maxArea = Math.max(area, maxArea);
            if(height[leftside] < height[rightside]){
                leftside++;
            }else{
                rightside--;
            }
        }
        return maxArea;
    }
}