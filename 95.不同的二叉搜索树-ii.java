import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<>();
        if(n == 0){
            return list;
        }
        return getAns(1, n);
    }

    //递归调用
    public List<TreeNode> getAns(int start,int end){
        List<TreeNode> treeList = new ArrayList<>();
        if(start > end){
            treeList.add(null);
            return treeList;
        }

        if(start == end){
            TreeNode node = new TreeNode(start);
            treeList.add(node);
            return treeList;
        }

        //尝试每个数字作为根节点
        for(int i = start;i <= end;i++){
            //得到所有可能的左子树
            List<TreeNode> leftTrees = getAns(start, i - 1);
            //得到所有可能的右子树
            List<TreeNode> rightTrees = getAns(i + 1, end);
            
            for(TreeNode litem : leftTrees){
                for(TreeNode ritem : rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left = litem;
                    root.right = ritem;
                    treeList.add(root);
                }
            }
        }
        return treeList;
    }
}
// @lc code=end

