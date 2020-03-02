/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
            int len = s.length();
            if(len < 2) return s;

            //状态数组以及初始化
            boolean[][] dp = new boolean[len][len];
    
            int maxlen = 1;
            int start = 0;
            for(int j = 1;j < len; j++){
                for(int i = 0;i < j;i++){
                    
                    //判断
                    if(s.charAt(i) == s.charAt(j)){
                        if(j - i < 3){
                            dp[i][j] = true;
                        }else{
                            dp[i][j] = dp[i+1][j-1];
                        }

                    }else{
                        dp[i][j] = false;
                    }

                    if(dp[i][j]){
                        int curLen = j - i +1;
                        if(curLen > maxlen){
                            maxlen = curLen;
                            start = i;
                        }
                    }
                }
            }
            return s.substring(start, start+maxlen);


    }


    //判断一个字符串是否是回文字符串
    public boolean isHWString(String s ){
        for(int k = 0;k < s.length()/2;k++){
            if(s.charAt(k) != s.charAt(s.length()-1 - k)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

