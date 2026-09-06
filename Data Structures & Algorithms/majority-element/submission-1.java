class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int maxCount = 0;

        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], 1);
           map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
           if (map.get(nums[i]) > maxCount){
            res = nums[i];
            maxCount = map.get(nums[i]);
           }
        }
        return res;
    }
}