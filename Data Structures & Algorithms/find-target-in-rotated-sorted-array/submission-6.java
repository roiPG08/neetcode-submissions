class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int k = l + (r - l) / 2; // computing middle index
            
            if (nums[k] == target) {
                return k;
            }

            //ASSUMING LEFT SIDE IS SORTED
            if (nums[k] >= nums[l]) {
                if(nums[l] <= target && target < nums[k]){
                    //The target lives here
                    r = k - 1;
                }else{
                    //Target does not live here, moves l to other - right side
                    l = k + 1;
                }
            } else {
                //THE RIGHT SIDE IS SORTED
                if(nums[k] < target && nums[r] >= target){
                    l = k + 1;
                }else{
                    //Target does not live here so we go back to left side.
                    r = k - 1;
                }
            }
        }
        return -1;
    }
}
