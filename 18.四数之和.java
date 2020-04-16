import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums == null || nums.length < 4) return list;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            for(int j = nums.length-1;j >= 0;j--){
                int l = i + 1;
                int k = j - 1;
                while(l < k && i < j){
                    if(nums[i]+nums[l]+nums[k]+nums[j] == target){
                        list.add(Arrays.asList(nums[i],nums[l],nums[k],nums[j]));
                        k--;
                        l++;
                    }else if(nums[i]+nums[l]+nums[k]+nums[j] > target){
                        k--;
                    }else{
                        l++;
                    }
                }
            }
        }
        return list;
    }
}
// @lc code=end

