/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int num : nums){
            if(num == 1){
                count++;
            }else{
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
// @lc code=end

