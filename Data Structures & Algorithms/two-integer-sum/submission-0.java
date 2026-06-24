class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSumIndices = new int[2];
        int i,j;
        for(i=0;i<nums.length; i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    twoSumIndices[0]=i;
                    twoSumIndices[1]=j;
                    break;
                }
            }
        }
        return twoSumIndices;
    }
}
