/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        // char[] strs = s.toCharArray();
        // int result = 0;
        // int scale = 1;
        // for(int i=0;i<strs.length;i++){
        //     //进制
        //     result += ((int)strs[strs.length-i-1]-64)*scale;
        //     scale *= 26;
        // }
        // return result;

        int result =0;
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i)-'A'+1;
            result = result*26 + num;
        }
        return result;
    }
}
// @lc code=end

