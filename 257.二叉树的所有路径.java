import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
            List<String> list = new ArrayList<>();
            genetatePath(root, "", list);
            return list;
    }

    public List<String> genetatePath(TreeNode root,String path,List<String> paths){
            if(root != null){
                path +=(root.val);
                if(root.left == null && root.right == null){
                    paths.add(path.toString());
                }else{
                    path += "->";
                    genetatePath(root.left, path, paths);
                    genetatePath(root.right, path, paths);
                }
            }
            return paths;
    }

}
// @lc code=end

