/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
           int start = 0;
           int end = nums.length - 1;
           int middle = (start + end)/2;
           int pos = -1;
           while(start <= end){
               if(target > nums[middle]){
                   start = middle + 1;
                   middle = (start + end)/2;
               }else if(target < nums[middle]){
                   end = middle - 1;
                   middle = (start + end)/2;
               }else{
                   pos = middle;
                   break;
               }
           }
           int s = pos;
           int e = pos;
           while(s > 0 && nums[s-1] == target){
               s--;
           }
           while(e < nums.length-1 && nums[e+1] == target){
                e++;
           }
           int[] n = new int[]{s,e};
           return n;
    }
}
// @lc code=end

