class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int mid=start+end/2;
        int output=nums[mid];

        return output;
    }
}