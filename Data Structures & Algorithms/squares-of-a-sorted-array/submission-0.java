class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] res = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            // if(l == r){
            //     res[i] = (int) Math.pow(nums[r], 2);
            //     return res;
            // }

            if ((int) Math.pow(nums[r], 2) > (int) Math.pow(nums[l], 2)) {
                res[i] = (int) Math.pow(nums[r--], 2);
            } else {
                res[i] = (int) Math.pow(nums[l++], 2);
            }
        }
        return res;
    }
}