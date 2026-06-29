class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1,maxArea=0;
        while(i<j){
            int currArea=(j-i)*Math.min(heights[j],heights[i]);
            maxArea=Math.max(maxArea,currArea);
            if(heights[j]<heights[i]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxArea;
    }
}
