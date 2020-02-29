/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
            int temp =x^y;
            int result = 0;
            for(int i = 31;i >= 0 && temp!=0;i--){
                if((temp & 1) == 1){
                    result++;
                }
                temp = temp>>1;
            }
            return result;
    }
}
// @lc code=end

