import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */
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
    public TreeNode sortedArrayToBST(int[] nums) {
            if(nums == null || nums.length <= 0){
                return null;
            }

            int len = nums.length;
            int mid = len/2;
            int midVla = nums[mid];
            TreeNode root = new TreeNode(midVla);

            if(mid > 0){
                root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0,mid));
            }

            if(mid < len-1){
                root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1,len));
            }
            
            return root;

    }
}

