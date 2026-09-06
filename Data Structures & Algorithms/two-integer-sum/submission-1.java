class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        
        for(int x=0; x<nums.length; x++){
            set.put(nums[x], x);
        }

        for(int i=0; i < nums.length; i++){
            int required = target - nums[i];
            if(set.containsKey(required) && set.get(required) != i){
                return new int[]{i, set.get(required)};
            }
        }
        return null;
    }
}
