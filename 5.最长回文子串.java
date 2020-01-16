/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
            String ans = "";
            int len = s.length();
            int max = 0;
            if(len == 1){
                return s;
            }
            for(int i=0;i<len;i++){
                for(int j=i+1;j <= len;j++){
                    String test = s.substring(i, j);
                    if(isHWString(test) && test.length() > max){
                        ans = s.substring(i, j);
                        max = test.length();
                    }
                }
            }
            return ans;
        
           
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

