class Solution {
    public int pivotIndex(int[] nums) {
        // LEFTMOST index is pivot = sum of left side of array = right side of array
        // if not possible that both sides sum up to the same number
        // we should return -1 

        int total = 0;

        for(int num : nums){
            total += num;
        }

        int leftSum = 0;
        for(int i = 0; i<nums.length; i++){
            int rightSum = total - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += nums[i];
            
        }
        return -1;
    }
}