/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int step = 0;
        int end = 0;
        int maxPosition = 0;
        for(int i = 0;i < nums.length - 1;i++){
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if(i == end){
                end = maxPosition;
                step++;
            }
        }
        return step;
    }
}
// @lc code=end

