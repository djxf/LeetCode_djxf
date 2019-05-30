/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */
class Solution {
    public int removeElement(int[] nums, int val) {

        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
               nums[count] = nums[i];
               count++;
            }
        }
        return count;
    }
}

