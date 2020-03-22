/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
            int len = str.length();
            int index = 0;
            //去除空格不要 调用库函数
            while(index < len){
                if(str.charAt(index) != ' '){
                    break;
                }
                index++;
            }
            if(index == len){
                return 0;
            }
            //去除空格后 遇到的第一个不是空格的字符判断下是不是符号
            int sign = 1;
            if(str.charAt(index) == '-'){
                sign = -1;
                index++;
            }else if(str.charAt(index) == '+'){
                index++;
            }
            int res = 0;
            while(index < len){
                char currChar = str.charAt(index);
                //判断合法性
                if(currChar > '9' || currChar < '0'){
                    break;
                }

                //判断是否越界
                if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && (currChar - '0') > Integer.MAX_VALUE%10)){
                    return Integer.MAX_VALUE;
                }else if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10) && (currChar - '0') > -(Integer.MIN_VALUE%10)){
                    return Integer.MIN_VALUE;
                }
                res = res*10 + sign*(currChar - '0');
                index ++;

            }
            return res;
    }
}
// @lc code=end

