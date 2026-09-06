class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            currentSum += nums[r];

            //HERE WE SHRINK!
            while(currentSum >= target){
                minLength = Math.min(minLength, r - l + 1);
                currentSum -= nums[l];
                l++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}