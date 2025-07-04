class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int mid=0,low=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);

                mid++;low++;

            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,nums);
                high--;

            }
        }
        
    }

    private void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}