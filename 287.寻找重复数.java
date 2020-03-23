import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
            if(nums == null || nums.length == 0){
                return -1;
            }
            Arrays.sort(nums);
            int j;
            for(int k = 0;k < nums.length-1;k++){
                j = k + 1;
                if(nums[k] == nums[j]){
                    return nums[k];
                }
            }
            return -1;
    }
}
// @lc code=end

