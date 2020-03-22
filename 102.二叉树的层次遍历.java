import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            int i = 0;
            int j = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            if(root != null){
                queue.add(root);
                i = 1;
            }else{
                return list;
            }

            List<Integer> tempList = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                tempList.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                    j++;
                }
                if(node.right != null){
                    queue.add(node.right);
                    j++;
                }
                if(--i == 0){
                    list.add(tempList);
                    tempList = new ArrayList<>();
                    i = j;
                    j = 0;
                }
            }

            return list;            
    }
}
// @lc code=end

