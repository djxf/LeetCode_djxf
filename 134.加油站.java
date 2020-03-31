/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {


        for(int i = 0;i < gas.length;i++) {
            int capacity = 0;
            //行驶一周计数器
            int count = 0;
        
            for(int j = i;count < gas.length;j++){
                j %= gas.length - 1;
                capacity += gas[j];
                capacity -= cost[j];
                if(capacity < 0){
                    continue;
                }
                count++;
                if(count == gas.length){
                   return j;
                }
            }
        }
        return -1;

    }
}
// @lc code=end

