import java.lang.Thread.State;
import java.lang.annotation.ElementType;

/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
    
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(!(s.charAt(start) == s.charAt(end))){
                return isPalindrome(s.toCharArray(), start+1, end) || isPalindrome(s.toCharArray(),start, end-1);
            }else{
                start++;
                end--;
            }
        }
        return true;
    }

    public boolean isPalindrome(char[] c,int i,int j){
        while(i < j){
            if(c[i] == c[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

