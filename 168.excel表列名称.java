/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int c  = n % 26;
            if(c == 0){
                    c = 26;
                    n -= 1;
            }
            sb.insert(0, (char)('A'+c-1));
            n /= 26;
        }
        return sb.toString();
    }
}
// @lc code=end

