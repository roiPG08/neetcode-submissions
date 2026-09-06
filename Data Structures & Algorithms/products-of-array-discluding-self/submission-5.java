class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int pre = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                output[i] = pre;
            } else {
                output[i] = nums[i - 1] * pre;
                pre = nums[i - 1] * pre;
            }
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
                output[i] = output[i] * postfix;
                postfix = postfix * nums[i];
            
        }

        return output;
    }
}
