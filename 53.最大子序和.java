/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = nums[0];
        for(int num : nums){
            sum = sum > 0 ? sum + num : num;
            if(res < sum){
                res = sum;
            }
        }
        return res;
        
    }
}

