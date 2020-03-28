import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=99 lang=java
 *
 * [99] 恢复二叉搜索树
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
    public void recoverTree(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode pred = null;
            //被交换节点1 
            TreeNode x = null;
            //被交换节点2
            TreeNode y = null;
            while(root != null || !stack.isEmpty()){
                while(root != null){
                    stack.add(root);
                    root = root.left;
                }
                root = stack.pop();
                if(pred != null && root.val < pred.val){
                    y = root;
                    if(x == null){
                        x = pred;
                    }else{
                        break;
                    }
                }

                pred = root;
                root = root.right;
            }
            swap(x,y);
    }

    private void swap(TreeNode x, TreeNode y) {
        int temp = x.val;
        x.val = y.val;
        y.val = temp;
    }
}
// @lc code=end

