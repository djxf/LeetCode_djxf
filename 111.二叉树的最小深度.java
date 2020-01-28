/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null ){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null || root.right == null){
            return minDepth(root.left)+minDepth(root.right)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }
}
// @lc code=end

