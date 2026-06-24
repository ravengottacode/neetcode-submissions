class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> numDiff = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numDiff.put(nums[i],i);
        }    
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(numDiff.containsKey(diff) && numDiff.get(diff) != i){
                ans[0]=i;
                ans[1]=numDiff.get(diff);
                break;
            }
        }
        return ans;
    }
}
