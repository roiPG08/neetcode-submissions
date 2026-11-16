class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[r] + nums[l];
                if (sum == 0) {
                    set.add(List.of(nums[i], nums[r], nums[l]));
                    l++;
                    r--;
                    if (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                } else if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                }
            }
        }

        return new ArrayList<>(set);
    }
}