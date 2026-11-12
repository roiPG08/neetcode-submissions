class Solution {
    public int maxSubArray(int[] nums) {
        int maxSeen = nums[0];
        int currentChainSum = 0;

        for (int num : nums) {
            if (currentChainSum + num <= num) {
                currentChainSum = num;
            } else {
                currentChainSum += num;
            }
            maxSeen = Math.max(maxSeen, currentChainSum);
        }
        return maxSeen;
    }
}
