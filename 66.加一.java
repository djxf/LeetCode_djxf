/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        //1 数组->数字
        //2 数字+1
        //3 数字->数组

        //数组末位+1 如果大于9 倒数第二位加1 末位变为0 ......

        digits[digits.length-1] += 1;
        // for(int i = digits.length-1;i <= 0;i--){
        //     digits[i] += 1;
        //     if(digits[i] > 9){
        //         digits[i] = 0;
        //         digits[i-1] +=1;
        //     }
        // }
        return digits;
    }
}

