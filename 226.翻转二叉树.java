import java.util.LinkedList;
import java.util.Queue;


/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    public TreeNode invertTree(TreeNode root) {

        //递归
        // if(root == null){
        //     return null;
        // }
        // TreeNode right = invertTree(root.right);
        // TreeNode left = invertTree(root.left);
        // root.right = left;
        // root.left = right;
        // return root;
        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }
        return root;
    }
}
// @lc code=end

