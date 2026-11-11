class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private int[] nums;
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        backtracking(new ArrayList<>(), 0, target, 0); 
        return result;
    }

    public void backtracking(List<Integer> path, int sum, int target, int start) {
        // Base case: Success
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        
        // Constraint: We overshot the target, stop exploring this branch
        if (sum > target) {
            return;
        }

        // Loop starts from 'start' to prevent duplicate combinations like [3, 2]
        for (int i = start; i < nums.length; i++) {
            // 1. Choose
            path.add(nums[i]);
            // 2. Explore: Notice we pass 'sum + nums[i]' and we pass 'i' as the new start
            backtracking(path, sum + nums[i], target, i);
            // 3. Unchoose: Unconditional cleanup
            path.remove(path.size() - 1);
        }
    }
}