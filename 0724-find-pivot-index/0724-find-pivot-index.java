class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            if(total_sum-leftsum-nums[i]==leftsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }

}