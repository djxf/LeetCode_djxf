/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        for(int i=31;n!=0;n = n >>> 1,i--){
            result += n & 1;
        }
        return result;
    }
}
// @lc code=end

