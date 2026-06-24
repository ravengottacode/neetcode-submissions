class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        for(int num:nums){
             if (numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num) + 1);
                if(numCount.get(num)>1)
                    return true;
            } else {
                numCount.put(num, 1);
            }
        }
        return false;
    }
}