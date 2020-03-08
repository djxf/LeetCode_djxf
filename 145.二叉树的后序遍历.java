import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {
        // List<Integer> list = new ArrayList<>();
        // if(root == null){
        //     return list;
        // }
        // list.addAll(postorderTraversal(root.left));
        // list.addAll(postorderTraversal(root.right));
        // list.add(root.val);
        // System.out.println(root.val);

        return treeIteration(root);
    }

    //迭代算法
    public List<Integer> treeIteration(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> staList = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curNode = stack.pop();
            staList.push(curNode.val);
            if(curNode.left != null) stack.push(curNode.left);
            if(curNode.right != null) stack.push(curNode.right);
        }

        while(!staList.isEmpty()){
            list.add(staList.pop());
        }

        return list;
        
    }
}
// @lc code=end

