class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;

        List<Integer> currentPath = new ArrayList<>();
        backtracking(0, currentPath);

        return result;
    }

    public void backtracking(int index, List<Integer> path) {
        // base case
        if (index == nums.length) {
            // finalised all paths
            result.add(new ArrayList(path));
            return;
        }

        // Choices
        path.add(nums[index]);
        backtracking(index + 1, path);
        path.remove(path.size() - 1);
        backtracking(index + 1, path);
    }
}
