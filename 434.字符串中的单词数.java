/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
            String trimmed = s.trim();
            if(trimmed.equals("")){
                return 0;
            }
            return trimmed.split("\\s+").length;
    }
}
// @lc code=end

