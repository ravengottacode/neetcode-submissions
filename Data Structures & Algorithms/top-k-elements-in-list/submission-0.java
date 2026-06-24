class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}
