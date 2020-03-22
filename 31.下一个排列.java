/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int k = nums.length-1;
        int l = nums.length-2;
        if(nums[k] < nums[l]){
            int temp = nums[k];
            nums[k] = nums[l];
            nums[l] = temp;
        }else{
            k--;
            l--;
            while()
        }
    }
}
// @lc code=end

