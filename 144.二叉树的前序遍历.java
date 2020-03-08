import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        // 递归
        // List<Integer> list = new ArrayList<>();
        // if(root == null){
        //     return list;
        // }
        // list.add(root.val);
        // list.addAll(preorderTraversal(root.left));
        // list.addAll(preorderTraversal(root.right));
        // return list;

        //申请一个栈
        



            return treeIteration(root);

    }

    //二叉树的前序遍历 非递归
    public List<Integer> treeIteration(TreeNode root){
        
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
        return list;
    }
}
// @lc code=end

