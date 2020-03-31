/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        
        //当前能跳到的最大位置
        int maxPosition = 0;
        //每跳一步可以到达的最右边界
        int end = 0;
        for(int i = 0;i < nums.length - 1;i++){
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if(end == i){
                end = maxPosition;
            }
        }
        return end >= nums.length - 1;
    }
}
// @lc code=end

