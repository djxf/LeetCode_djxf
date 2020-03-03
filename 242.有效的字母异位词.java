/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        return Math.abs(sumChar(s) - sumChar(t)) < 0.0001;
    }
    
    //论文查重原理 查看数字起来是否一样 抄别人的。
    public double sumChar(String s){
        double sum = 0;
        char[] cs = s.toCharArray();
        for(char c : cs){
            sum += Math.pow((int)c,0.5);
        }
        return sum;
    }
}
 // @lc code=end

