/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//  int levels = preorder.length / 2 + 1;
// int[] result = new int[(preorder.length * 2) - 1];

class Solution {
    private HashMap<Integer, Integer> map = new HashMap<>();
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int i = 0;
        for (int num : inorder) {
            map.put(num, i);
            i++;
        }

        return construct(preorder, 0, preorder.length-1);
    }

    private TreeNode construct(int[] preorder, int inStart, int inEnd) {
        if(inStart > inEnd) return null;

        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);

        int mid = map.get(val);

        root.left = construct(preorder, inStart, mid - 1);
        root.right = construct(preorder, mid + 1, inEnd);

        return root;
    }
}
