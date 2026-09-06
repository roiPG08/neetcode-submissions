class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                x++;
            }else{
                if(x > 0){
                    nums[i-x] = nums[i];
                    nums[i] = val;
                    k++;
                }else{
                    k++;
                }
            }  
        }
        return k;     
    }
}