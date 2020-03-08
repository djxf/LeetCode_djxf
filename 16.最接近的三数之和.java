import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
           if(nums == null || nums.length < 3) return -1;
           Arrays.sort(nums);
           int result = nums[0]+nums[1]+nums[2];
           for(int i = 0;i < nums.length-2;i++){
               int l = i + 1;
               int k = nums.length - 1;
               while(l < k){
                    int sum = nums[i]+nums[k]+nums[l];
                    if(Math.abs(sum - target) < Math.abs(result - target))
                        result = sum;
                    if(sum > target){
                        k--;
                    }else{
                        l++;
                    }
               }
           }
           return result;
    }
}
// @lc code=end

