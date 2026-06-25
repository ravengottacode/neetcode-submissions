class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        int key=1;
        for(int num:numbers){
            numsMap.put(num,key++);
        }
        for(int i=0;i<numbers.length;i++){
            if(numsMap.containsKey(target-numbers[i])){
                return new int[]{i+1,numsMap.get(target-numbers[i])};
            }
        }
        return new int[0];
    }
}
