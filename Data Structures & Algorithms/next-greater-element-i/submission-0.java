class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums1Idx = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Idx.put(nums1[i], i);
        }
        // decreasing monotonic Stack
        Stack<Integer> stack = new Stack();
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                int val = stack.pop();
                int idx = nums1Idx.get(val);
                result[idx] = nums2[i];
            }
            if (nums1Idx.containsKey(nums2[i])) {
                stack.push(nums2[i]);
            }
        }

        return result;
    }
}