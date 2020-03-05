/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
          char[] cs = s.toCharArray();
          int j = -1;
          for(int i = 0;i < cs.length;i++){
              j = t.indexOf(cs[i], j+1);
              if(j == -1) return false;
          }
          return true;
    }
}
// @lc code=end

