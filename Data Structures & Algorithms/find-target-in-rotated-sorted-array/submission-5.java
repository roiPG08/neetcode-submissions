class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int k = l + (r - l) / 2; // computing middle index
            // System.out.println("k = " + k);
            // System.out.println("r = " + r);
            // System.out.println("l = " + l);
            if (nums[k] == target) {
                return k;
            }

            //ASSUMING LEFT SIDE IS SORTED
            if (nums[k] >= nums[l]) {
                // correct ascending order
                if(nums[l] <= target && target < nums[k]){
                    //The target lies in the left side
                    r = k - 1;
                }else{
                    l = k + 1;
                }
            } else {
                //IT WASNT SO THE RIGHT SIDE MUST BE SORTED
                if(nums[k] < target && nums[r] >= target){
                    l = k + 1;
                }else{
                    r = k - 1;
                }
            }
        }
        return -1;
    }
}
