class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        if(size==0)
            return 0;
        Arrays.sort(nums);
        int c=0,finalAns=0;
        for(int i=0;i<size-1;i++){
            if(nums[i+1]-nums[i]==1){
                c++;
                finalAns = Math.max(finalAns,c);
            }
            else if(nums[i+1]==nums[i]){
                continue;
            }
            else{
                c=0;
            }
        }
        return finalAns+1;
    }
}
