class Solution {
    public int binary_search(int[] nums, int l, int r, int target) {
        if (l > r)
            return -1;

        int mid = l + (r - l) / 2;

        if (nums[mid] == target)
            return mid;
        return (nums[mid] < target) ? binary_search(nums, mid + 1, r, target)
                                  : binary_search(nums, l, mid - 1, target);
    }
    public int search(int[] nums, int target) {
        return binary_search(nums, 0, nums.length -1, target);
    }
}

// int l = 0;
// int r = nums.length - 1;

// while (l <= r) {
//     int mid = l + ((r - l) / 2);
//     if (nums[mid] > target) {
//         r = mid - 1;
//     } else if (nums[mid] < target) {
//         l = mid + 1;
//     } else {
//         return mid;
//     }
// }

// return -1;