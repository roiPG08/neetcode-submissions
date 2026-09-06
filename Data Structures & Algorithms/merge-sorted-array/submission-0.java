class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        int l = n - 1;
        int r = m - 1;

        while (l >= 0) {
            if (r >= 0 && nums1[r] > nums2[l]) {
                nums1[last--] = nums1[r--];
            } else {
                nums1[last--] = nums2[l--];
            }
        }
    }
}