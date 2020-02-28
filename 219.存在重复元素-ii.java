import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // //效率低
        // for(int i = 0;i < nums.length;i++){
        //         for(int j = i + 1;j < nums.length;j++){
        //             if(nums[i] == nums[j] && Math.abs(i - j) <= k){
        //                 return true;
        //             }
        //         }
        //     }
        //     return false;
        // TreeSet<Integer> set = new TreeSet<>();
        // for(int i=0;i < nums.length;i++){
        //     if(set.contains(nums[i])){
        //         return true;
        //     }
        //     set.add(nums[i]);
        
        //     if(set.size() > k){
        //         set.remove(nums[i-k]);
        //     }
        // }
        // return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            Integer obj = map.get(nums[i]);
            //如果之前不存在
            if(obj == null){
                map.put(nums[i], i);
            }else{
                //如果之前存在 判断一下距离
                if(i - obj <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;


    }
}
// @lc code=end

