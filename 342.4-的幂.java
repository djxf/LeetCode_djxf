/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
            if(num < 1) return false;
            while(num % 4 == 0){
                num /= 4;
            }
            return num==1;
    }
}
// @lc code=end

