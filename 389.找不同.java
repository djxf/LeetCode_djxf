/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {

        return (char)(Math.abs(sumChar(s) - sumChar(t)));

    }

    //把char转成数字求和
    public int sumChar(String str){
        int sum = 0;
        for(char c : str.toCharArray()){
            sum += (int)c;
        }
        return sum;
    }

}
// @lc code=end

