/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        int result = 1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == result){
                result++;
            }
        }
    }
}
// @lc code=end

