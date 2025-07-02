public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length <= 1)    return;
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        
        while(index <= right) {
            if(nums[index] == 0) {
                swap(left, index, nums);
                index ++;
                left ++;
            } else if(nums[index] == 2) {
                swap(index, right, nums);
                right --;
            } else {
                index ++;
            }
        }
    } 
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

