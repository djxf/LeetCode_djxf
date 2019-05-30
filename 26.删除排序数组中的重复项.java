/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 * [1,1,2]
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1:0;
        for (int n : nums) {
            if(n > nums[i-1])
                nums[i++] = n;
        }
        return i;
}
}
