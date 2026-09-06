class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxCapacity = 0;
        while (l < r) {
            int currentCapacity = 0;
            currentCapacity = (r - l) * Math.min(heights[l], heights[r]);
            maxCapacity = Math.max(maxCapacity, currentCapacity);
            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }

        return maxCapacity;
    }
}
