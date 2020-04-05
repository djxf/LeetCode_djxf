/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return n;
        }
        int up = 1;
        int down = 1;
        for(int i = 1;i < n;i++){
            if(nums[i] > nums[i - 1]){
                up = down + 1;
            }
            if(nums[i] < nums[i - 1]){
                down = up + 1;
            }
        }
        return up > down ? up : down;
    }
}
// @lc code=end

