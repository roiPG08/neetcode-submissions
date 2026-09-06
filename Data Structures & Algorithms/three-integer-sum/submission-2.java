class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // now we do 2 pointers
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[r] + nums[l] + nums[i];
                if (sum == 0) {
                    set.add(List.of(nums[r--], nums[l++], nums[i]));
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