import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(hashMap.containsKey(target - numbers[i])){
                result[0] = hashMap.get(target-numbers[i]) + 1;
                result[1] = i + 1;
                return result;
            }{
                hashMap.put(numbers[i], i);
            }
        }
        return result;
    }
}
// @lc code=end

