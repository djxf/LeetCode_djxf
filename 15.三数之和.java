import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            if(nums == null || nums.length  <= 2) return list;
            Arrays.sort(nums);
            for(int i = 0;i < nums.length-2;i++){
                if(i > 0 && nums[i] == nums[i-1]) continue;
                int tatget = - nums[i];
                int k = i +1;
                int l = nums.length - 1;
                while(k < l && l > 1 && k < nums.length-1){
                    if(nums[k] + nums[l] == tatget){
                        list.add(Arrays.asList(nums[k],nums[l],-tatget));
                        k++;
                        l--;
                        while(k < nums.length && nums[k] == nums[k-1]) k++;
                        while(l > k && nums[l] == nums[l + 1]) l--;
                    }else if(nums[k] + nums[l] > tatget){
                        l--;
                    }else{
                        k++;
                    }
                }
            }
            return list;

    }
}
// @lc code=end

