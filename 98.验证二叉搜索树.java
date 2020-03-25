/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    public boolean isValidBST(TreeNode root) {
            if(root == null){
                return true;
            }
            int value = root.val;
            if(root.left != null && root.left.val >= root.val){
                return false;
            }
            if(root.right != null && root.right.val <= root.val){
                return false;
            }
            return (isValidBST(root.left) && isValidBST(root.right));
    }

}
// @lc code=end

