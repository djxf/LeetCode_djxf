/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int sum2 = (1+nums.length)*nums.length/2;
        return Math.abs(sum -sum2);
    }
}
// @lc code=end

