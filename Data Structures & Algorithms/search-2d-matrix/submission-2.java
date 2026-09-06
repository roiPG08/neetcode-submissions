class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int lastIndexOfList = matrix[i].length - 1;
            if (matrix[i][0] <= target && matrix[i][lastIndexOfList] >= target) {
                return binary_search(0, lastIndexOfList, matrix[i], target);
            }
        }
        return false;
    }

    public boolean binary_search(int l, int r, int[] nums, int target) {
        if (l > r)
            return false;

        int mid = l + (r - l) / 2;

        if (nums[mid] == target)
            return true;

        return (nums[mid] < target) ? binary_search(mid + 1, r, nums, target)
                                    : binary_search(l, mid - 1, nums, target);
    }
}
