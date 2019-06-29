/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1,num2;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    num1 = i;
                    num2 = j;
                    return new int[] {num1,num2};
                }
            }
        }
        return null;
    }
}

