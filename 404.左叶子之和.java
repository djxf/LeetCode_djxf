/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeavesHelper(root,false);
    }

    //辅助函数 巧妙用一个标志标记左右叶子节点
    public int sumOfLeftLeavesHelper(TreeNode root,boolean flag){
        if(root == null){
            return 0;
        }
        int leave = 0;
        if(flag && root.left == null && root.right == null){
            leave += root.val;
        }
        int left = sumOfLeftLeavesHelper(root.left, true);
        int right = sumOfLeftLeavesHelper(root.right,false);
        return leave + left +right;
    }
}
// @lc code=end

