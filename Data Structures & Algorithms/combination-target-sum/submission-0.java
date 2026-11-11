class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        List<Integer> path = new ArrayList<>();
        backtracking(path, 0, target, 0);
        return result;
    }

    public void backtracking(List<Integer> path, int sum, int target, int start) {
        // Base case
        if (sum == target) {
            result.add(new ArrayList(path));
            return;
        }
        // Constraint
        if (sum > target) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            // Pick or skip
            path.add(nums[i]);
            backtracking(path, sum + nums[i], target, i);
            path.removeLast();
        }
    }
}
