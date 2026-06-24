class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int finalAns=1;
        for (int num : nums) {
            set.add(num);
        }
        for(int num:nums){
            if(!set.contains(num-1)){
                int c=1, temp=num, end=nums.length;
                while(end!=0){
                    if(set.contains(temp+1)){
                        c++;temp++;
                    }
                    end--;
                }
                finalAns=Math.max(finalAns,c);
            }
        }
        return finalAns;
    }
}
