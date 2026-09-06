class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        
        for(int r = 0; r < nums.length; r++){
            if(nums[r] != 0){
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l++;
                //nums[l++] = nums[r];
            }
        }

        // while(l < nums.length){
        //     nums[l++] = 0;
        // }
    }
}