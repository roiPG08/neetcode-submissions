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

class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {      
        inspect(root, 0);
        return result;
    }

    private void inspect(TreeNode root, Integer depth) {
        if (root == null)
            return;

        if(result.size() == depth){
            result.add(root.val);
        }

        inspect(root.right, depth+1);
        inspect(root.left, depth+1);
        
    }
}
