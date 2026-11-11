class Solution {
    private int[] nums;
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        List<Integer> currPath = new ArrayList<>();
        backtracking(currPath);
        return result;
    }

    public void backtracking(List<Integer> path) {
        if (path.size() == nums.length) {
            result.add(new ArrayList(path));
            return;
        }

        // pick
        for (int num : nums) {
            // constraint
            if (path.contains(num))
                continue;
            // picking
            path.add(num);
            backtracking(path);
            // skipping
            // backtracking
            path.remove(path.size() - 1);
        }
    }
}
