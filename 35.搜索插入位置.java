/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 * 二分查找
 * 1 
 * 1 2 
 * 1 2 3
 * 1 2 3 4
 */
class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int middle = (nums.length-1)/2;
        int high = nums.length-1;
        
        while(nums[middle] != target && high > low){
            if(nums[middle] > target){
                high = middle - 1;
                middle = (high + low)/2;
            }else{
                low = middle + 1;
                middle = (low + high)/2;
            }
        }
        if(nums[middle] == target){
            return middle;
        }else if(nums[middle] > target){
            return middle;
        }else{
            return middle+1;
        }
    }
}
//low=0 m=1 h=3  3>0    h=0 m=0
