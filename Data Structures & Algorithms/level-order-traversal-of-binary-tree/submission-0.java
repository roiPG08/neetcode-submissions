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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return List.of(); 
        currentLevelValue(root, 0);
        return result;
    }

    private void currentLevelValue(TreeNode root, Integer depth){
        if(root == null) return;

        if(result.size() == depth){
            result.add(new ArrayList<>());
        }

        result.get(depth).add(root.val);
        currentLevelValue(root.left, depth + 1);
        currentLevelValue(root.right, depth + 1);
    }
}
