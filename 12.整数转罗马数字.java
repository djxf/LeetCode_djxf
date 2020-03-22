/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder  str = new StringBuilder();
        int index = 0;
        while(index < 13){
            while(num >= nums[index]){
                str.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        return str.toString();
    }
}
// @lc code=end

