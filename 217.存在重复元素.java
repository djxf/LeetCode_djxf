import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        Set<Integer> set = new HashSet<>(nums.length);
        for(int x : nums){
            if(set.contains(x)){
                return true;
            }else{
                set.add(x);
            }
        }
        return false;
    }
}
// @lc code=end

