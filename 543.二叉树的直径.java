/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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

    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int left = maxTreeHeigh(root.left);
        int right = maxTreeHeigh(root.right);
        return Math.max(left+right, result);
    }

    //求一二叉树的最大深度
    public int maxTreeHeigh(TreeNode tree){
        if(tree == null){
            return 0;
        }
        int left = maxTreeHeigh(tree.left);
        int right = maxTreeHeigh(tree.right);
        //需要在此更新最长路劲 因为不一定闯过根节点
        result = Math.max(result, left + right);
        return 1 + Math.max(left,right);
    }
}
// @lc code=end

