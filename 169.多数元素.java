import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        // Hash表
       HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], (Integer)hashMap.get(nums[i])+1);
            }else{
                hashMap.put(nums[i], 1);
            }
        }
      
        Map.Entry<Integer,Integer> entry = null;
        for(Map.Entry<Integer,Integer> entry2 : hashMap.entrySet()){
            if(entry == null || entry2.getValue() > entry.getValue()){
                entry = entry2;
            }
        }
        
        return entry.getKey();
        
        //   Arrays.sort(nums);
        //   return nums[nums.length/2];

    }
}
// @lc code=end

