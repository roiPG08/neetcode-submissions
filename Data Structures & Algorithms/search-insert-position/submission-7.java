class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        return search(l, r, nums, target);
    }

    private int search(int l, int r, int[] nums, int target) {
        // When bounds cross, 'l' is the correct insertion index
        if (l > r) {
            return l;
        }

        int mid = l + (r - l) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return search(l, mid - 1, nums, target);
        } else {
            return search(mid + 1, r, nums, target);
        }
    }
    // private int search(int l, int r, int[] nums, int target) {
    //     if (l > r) {
    //         return l;
    //     }
    //     int mid = r + (r - l) / 2;

    //     if (nums[mid] == target) {
    //         return mid;
    //     } else if (nums[mid] > target) {
    //         return search(l, mid - 1, nums, target);
    //     } else {
    //         return search(mid + 1, r, nums, target);
    //     }
    // }
}