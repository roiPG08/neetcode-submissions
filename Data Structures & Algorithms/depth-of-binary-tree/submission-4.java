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
    public int maxDepth(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();

        stack.push(new Pair(root, 1));
        int res = 0;

        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> current = stack.pop();
            TreeNode node = current.getKey();
            int depth = current.getValue();

            if(node!= null){
                res = Math.max(res, depth);
                stack.push(new Pair<>(node.left, depth + 1));
                stack.push(new Pair<>(node.right, depth + 1));
            }
        }
        return res;
    }
}

        // Queue<TreeNode> que = new LinkedList<>();
        // if (root != null) {
        //     que.add(root);
        // }
        // int level = 0;
        // while (!que.isEmpty()) {
        //     int size = que.size();
        //     for (int i = 0; i < size; i++) {
        //         TreeNode node = que.poll();
        //         if (node.left != null) {
        //             que.add(node.left);
        //         }
        //         if (node.right != null) {
        //             que.add(node.right);
        //         }
        //     }
        //     level++;
        // }
        // return level;

// if (root == null)
//     return 0;

// int rDepth = 1;
// int lDepth = 1;
// lDepth += (root.left != null) ? maxDepth(root.left) : 0;
// rDepth += (root.right != null) ? maxDepth(root.right) : 0;

// return Math.max(lDepth, rDepth);