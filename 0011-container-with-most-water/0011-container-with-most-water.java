class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int lp = 0, rp = height.length - 1;

        while (lp < rp) {
            int w = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int currwater = w * ht;
            maxwater = Math.max(maxwater, currwater);

            // Move the pointer that points to the shorter line
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxwater;
    }
}
