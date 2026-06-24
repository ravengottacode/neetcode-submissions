class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int[] answer = new int[nums.length];
        int pro=1;
        prefixProduct[0]=1;
        prefixProduct[1]=nums[0];
        suffixProduct[nums.length-1]=1;
        suffixProduct[nums.length-2]=nums[nums.length-1];
        for(int i=2;i<nums.length;i++){
            prefixProduct[i]=nums[i-1]*prefixProduct[i-1];
        }
        for(int i=nums.length-3;i>=0;i--){
            suffixProduct[i]=nums[i+1]*suffixProduct[i+1];
        }

        for(int i=0;i<nums.length;i++){
            answer[i]=prefixProduct[i]*suffixProduct[i];
        }
        return answer;
    }
}  
