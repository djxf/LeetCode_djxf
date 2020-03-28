/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
            //效率很低 被95%的大佬击败
            // for(int i = nums.length - 1;i >= 0;i--){
            //     int k = i;
            //     while(k < nums.length - 1 && k >= 0){
            //         if(nums[k] == 0){
            //             int temp = nums[k + 1];
            //             nums[k + 1] = nums[k];
            //             nums[k] = temp;
            //         }
            //         k++;
            //     }
            // }
           int i = 0;
           int j = 0;
           for(i = 0;i < nums.length;i++){
               if(nums[i] != 0){
                   nums[j] = nums[i];
                   j++;
               }
           }
           while(j < nums.length){
               nums[j] = 0;
               j++;
           }
    }
}
// @lc code=end

