/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
            int result = 0;
            for(int i=31; n != 0;n = n >>> 1,i--){
                result += (n & 1)<<i;
            }
            return result;
    }
}
// @lc code=end

