class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int n = nums.length;
        for(int i = 0; i < 2*n; i++){
            if(i >= n){
                ans[i] = nums[i-n];
            }else{
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}